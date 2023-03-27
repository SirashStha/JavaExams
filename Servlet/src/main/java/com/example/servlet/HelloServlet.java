package com.example.servlet;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.mail.Session;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        int id = Integer.parseInt(request.getParameter("id"));
        String name = (String)request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String address = (String) request.getParameter("address");

        Cookie cookie = new Cookie("id",request.getParameter("id"));
//        Cookie cookie1 = new Cookie("age", request.getParameter("age"));
        response.addCookie(cookie);
//        response.addCookie(cookie1);

        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        session.setAttribute("age",age);
        session.setAttribute("address",address);

        response.sendRedirect("Insert");
//        RequestDispatcher rd = request.getRequestDispatcher("Insert");
//        rd.forward(request,response);

        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.write("<html><body>");
        out.write("<h1>Inserted Successfully</h1> ");
        out.write("</body></html>");




    }

    public void destroy() {
    }
}