package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by parsecer on 17.10.2017.
 */
public class SecretLink extends HttpServlet {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                    response.sendRedirect("/NewMoscow/form.html");

            }
}
