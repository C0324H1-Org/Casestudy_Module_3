package com.example.casestudymodule.controller;

import com.example.casestudymodule.model.User;
import com.example.casestudymodule.service.IUserService;
import com.example.casestudymodule.service.iml.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "LoginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {
    private static final IUserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("product/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userService.login(username, password);

        if (user == null){
            request.setAttribute("mess", "Wrong username or password");
            request.getRequestDispatcher("product/login.jsp").forward(request, response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("/istore");
        }
    }
}

