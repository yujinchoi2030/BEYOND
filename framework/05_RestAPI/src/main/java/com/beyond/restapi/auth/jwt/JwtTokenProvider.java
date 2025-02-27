package com.beyond.restapi.auth.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class JwtTokenProvider
{
    private final SecretKey secretKey;
    private final UserDetailsService userDetailsService;
    private final RedisTemplate<String, String> redisTemplate;
    private static final long ACCESS_TOKEN_EXP = 1000L * 60L * 15L; //15분

    public JwtTokenProvider(@Value("${springboot.jwt.secret}") String secret, UserDetailsService userDetailsService, RedisTemplate<String, String> redisTemplate)
    {
        log.debug("Secret : {}", secret);

        this.secretKey = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), Jwts.SIG.HS256.key().build().getAlgorithm());
        this.userDetailsService = userDetailsService;
        this.redisTemplate = redisTemplate;
    }

    // AccessToken 을 생성하는 메서드
    public String createAccessToken(String username, String role)
    {
        Map<String, String> claims = new HashMap<>();

        claims.put("username", username);
        claims.put("role", role);

        return createToken(claims, ACCESS_TOKEN_EXP);
    }

    // RefreshToken 을 생성하는 메서드
    public String createRefreshToken(String username)
    {
        return "";
    }

    private String createToken(Map<String, String> claims, long tokenExp)
    {
        return Jwts.builder()
                .header().add("typ", "JWT").and() // typ 헤더 추가
                .claims(claims) // 공개 클래임 설정
                .id(Long.toHexString(System.nanoTime())) // jti(JWT ID) 클래임 설정
                .issuedAt(new Date()) // 발급시간 설정
                .expiration(new Date(System.currentTimeMillis() + tokenExp)) // 만료시간 설정 (현재시간 + 만료시간)
                .signWith(secretKey) // 서명을 생성
                .compact(); // JWT 토큰을 생성
    }

    // 토큰이 유효한지 체크하는 메서드 (토큰이 유효하면 true, 만료되면 false return)
    public boolean validateToken(String token)
    {
        Jws<Claims> claims = Jwts
                .parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token);

        return !claims
                .getPayload()
                .getExpiration()
                .before(new Date());
    }

    // 클라이언트가 헤더를 통해 서버로 전달한 토큰을 추출하는 메서드
    public String resolveToken(String bearerToken)
    {
        if(bearerToken != null && bearerToken.startsWith("Bearer "))
        {
            return bearerToken.substring(7);
        }
        return null;
    }

    // SecurityContextHolder 에 저장할 Authentication 객체를 생성하는 메서드
    public Authentication getAuthentication(String token)
    {
        String username = getUserName(token);

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }

    private String getUserName(String token)
    {
        return Jwts
                .parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .get("username")
                .toString();
    }

    // 로그아웃 시 블랙리스트에 Access Token 을 저장한다.
    public void addBlacklist(String accessToken)
    {
        String key = "blacklist:" + getJti(accessToken);
        redisTemplate.opsForValue().set(key,"true", ACCESS_TOKEN_EXP, TimeUnit.MILLISECONDS);
    }

    private String getJti(String token)
    {
        return Jwts
                .parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getId();
    }

    // 블랙리스트 등록 여부 확인
    public boolean isBlacklisted(String token)
    {
        String key = "blacklist:" + getJti(token);

        return redisTemplate.hasKey(key);
    }
}
