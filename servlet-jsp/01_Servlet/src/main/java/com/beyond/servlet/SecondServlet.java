package com.beyond.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.time.LocalDateTime;

// @WebServlet("/second.do")
// @WebServlet(name = "second", urlPatterns = "/second.do")
@WebServlet(name = "second", urlPatterns = {"/second.do", "/second2.do"})
public class SecondServlet extends HttpServlet {
    
    @Serial
    private static final long serialVersionUID = 959694951149178258L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request.getContextPath());
//        System.out.println(request.getServletPath());
//        System.out.println(request.getServerName());
//        System.out.println(request.getServerPort());
//        // -Djava.net.preferIPv4Stack=true을 VM 옵션으로 추가
//        System.out.println(request.getRemoteAddr());

        // 자바 코드로 응답 화면 작성
        // 1. 한글이 깨지는 것을 방지하기 위해서 응답 헤더를 설정
        response.setContentType("text/html;charset=utf-8");

        // 2. 응답 화면을 출력하기 위한 출력 스트림 얻어온다.
        PrintWriter out = response.getWriter();

        // 3. 응답 화면 작성
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>SecondServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>두 번째 서블릿이 반환 내용</h2>");
        out.println("<p>현재 시간 : " + LocalDateTime.now() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
