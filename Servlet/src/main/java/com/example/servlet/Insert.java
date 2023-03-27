package com.example.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="Insert", value = "/Insert")
public class Insert extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for(Cookie cookie : cookies) {
                if (cookie.getName().equals("id")) {
                    int id = Integer.parseInt(cookie.getValue());
                    out.write("Id: "+id);
                }

            }
        }

        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        int age = (int) session.getAttribute("age");
        String address = (String) session.getAttribute("address");

        response.setContentType("text/html");

        out.write("<html><body>");

        out.write("<br/>Name: "+name);
        out.write("<br/>Age: "+age);
        out.write("<br/>Address: "+address);
        out.write("</body></html>");
    }
}
