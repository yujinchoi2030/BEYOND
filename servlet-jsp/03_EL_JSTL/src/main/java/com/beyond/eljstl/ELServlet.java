package com.beyond.eljstl;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Serial;

@WebServlet("/el.do")
public class ELServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = -2952761693551385580L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ServletContext application = request.getServletContext();

        // Request 영역에 데이터를 저장
        request.setAttribute("classRoom", 1);
        request.setAttribute("student", new Student("홍길동", 24, 80, 80));
        request.setAttribute("scope", "Request 영역");

        // Session 영역에 데이터를 저장
        session.setAttribute("classRoom", 2);
        session.setAttribute("student", new Student("성춘향", 20, 90, 90));
        session.setAttribute("scope", "Session 영역");
        
        // Application 영역에 데이터를 저장
        application.setAttribute("classRoom", 3);
        application.setAttribute("student", new Student("이몽룡", 20, 80, 90));
        application.setAttribute("scope", "Application 영역");

        request.getRequestDispatcher("/views/el/el.jsp").forward(request, response);
    }
}
