package com.beyond.mvc.user.controller;

import com.beyond.mvc.user.model.service.UserService;
import com.beyond.mvc.user.model.service.UserServiceImpl;
import com.beyond.mvc.user.model.vo.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.Serial;

@WebServlet(name = "deleteServlet", urlPatterns = "/user/delete")
public class DeleteServlet extends HttpServlet {

    @Serial
    private static final long serialVersionUID = 4224203439655281237L;

    private final UserService userService;

    public DeleteServlet() {
        this.userService = new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int result = 0;
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("loginUser");

        result = userService.delete(loginUser.getNo());

        if (result > 0) {
            session.invalidate();
            request.setAttribute("msg", "정상적으로 탈퇴되었습니다.");
            request.setAttribute("location", "/");
        } else {
            request.setAttribute("msg", "탈퇴에 실패하였습니다.");
            request.setAttribute("location", "/user/info");
        }

        request.getRequestDispatcher("/views/common/msg.jsp").forward(request, response);
    }
}
