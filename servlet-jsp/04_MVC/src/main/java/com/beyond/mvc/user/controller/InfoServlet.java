package com.beyond.mvc.user.controller;

import com.beyond.mvc.user.model.vo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Serial;

@WebServlet(name = "infoServlet", urlPatterns = "/user/info")
public class InfoServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = -6631723942985433484L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/user/info.jsp").forward(request, response);
    }
}
