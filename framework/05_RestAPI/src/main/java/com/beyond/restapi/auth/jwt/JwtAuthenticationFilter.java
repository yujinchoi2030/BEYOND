package com.beyond.restapi.auth.jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter
{
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException
    {
        // 1. HttpServletRequest 에서 토큰을 추출
        String token = jwtTokenProvider.resolveToken(request.getHeader("Authorization"));

        // 2. 추출한 토큰의 유효성을 검사 & 블랙리스트 확인
        if(token != null && jwtTokenProvider.validateToken(token) && jwtTokenProvider.isBlacklisted(token))
        {
            // 3. 유효한 토큰인 경우, Authentication 객체를 생성 후 SecurityContextHolder 에 저장
            Authentication authentication = jwtTokenProvider.getAuthentication(token);

            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        filterChain.doFilter(request, response);
    }
}
