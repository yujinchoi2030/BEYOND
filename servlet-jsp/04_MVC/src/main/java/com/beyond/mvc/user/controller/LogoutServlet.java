package com.beyond.mvc.user.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Serial;

@WebServlet(name = "logoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = -3809630971561786552L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 로그아웃 순서
        // 1. 세션 객체를 얻어온다.
        HttpSession session = request.getSession();

        // 2. 세션 삭제한다.
        session.invalidate();

        // 3. 삭제 후 메인 화면으로 리다이렉트
        response.sendRedirect(request.getContextPath() + "/");
    }
}
