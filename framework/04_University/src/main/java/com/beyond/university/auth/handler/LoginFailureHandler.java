package com.beyond.university.auth.handler;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.*;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class LoginFailureHandler implements AuthenticationFailureHandler
{

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException
    {
        String message = "";
        // 주어진 사용자 이름을 찾을 수 없을 때
        if(exception instanceof UsernameNotFoundException)
        {
            message = "존재하지 않는 사용자입니다.";
        }
        // 잘못된 사용자 이름 또는 비밀번호가 입력된 경우에 발생
        else if(exception instanceof BadCredentialsException)
        {
            message = "아이디 또는 비밀번호가 틀립니다.";
        }
        // 계정 잠긴 경우에 발생
        else if(exception instanceof LockedException)
        {
            message = "잠긴 계정입니다.";
        }
        else if(exception instanceof DisabledException)
        {
            message = "탈퇴한 계정입니다.";
        }
        else if(exception instanceof AccountExpiredException)
        {
            message = "만료된 계정입니다.";
        }
        // 계정이 만료된 경우 발생
        else if(exception instanceof CredentialsExpiredException)
        {
            message = "비밀번호가 만료되었습니다.";
        }

        response.sendRedirect("/login?error=" + URLEncoder.encode(message, StandardCharsets.UTF_8));
    }
}
