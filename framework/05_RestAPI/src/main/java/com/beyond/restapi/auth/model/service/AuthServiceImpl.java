package com.beyond.restapi.auth.model.service;

import com.beyond.restapi.auth.jwt.JwtTokenProvider;
import com.beyond.restapi.auth.model.dto.TokenResponseDto;
import com.beyond.restapi.auth.model.mapper.AuthMapper;
import com.beyond.restapi.auth.model.vo.User;
import com.beyond.restapi.common.exception.UniversityException;
import com.beyond.restapi.common.exception.message.ExceptionMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService
{
    private final AuthMapper authMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public TokenResponseDto login(String username, String password)
    {
        // 1. username 을 가져와서 해당하는 사용자를 조회한다.
        User user = authMapper.selectUserById(username);

        // 2. passwordEncoder 를 사용해 데이터베이스에 저장된 패스워드와 입력받은 패스워드를 비교한다.
        if(user == null || !passwordEncoder.matches(password, user.getPassword()))
        {
            throw new UniversityException(ExceptionMessage.INVALID_CREDENTIALS);
        }
        
        // 3. 패스워드가 일치해서 인증을 통과하면 TokenResponseDto 를 생성해서 리턴한다.
        return new TokenResponseDto(
            jwtTokenProvider.createAccessToken(user.getUsername(), user.getRole()),
            jwtTokenProvider.createRefreshToken(user.getUsername())
        );
    }

    @Override
    public void logout(String bearerToken)
    {
        String accessToken = jwtTokenProvider.resolveToken(bearerToken);

        jwtTokenProvider.addBlacklist(accessToken);
    }
}
