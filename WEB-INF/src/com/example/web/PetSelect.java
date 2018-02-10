package com.example.web;

import com.example.model.PetExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class PetSelect extends HttpServlet {
        public PetSelect()  {

        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            response.setContentType("text/html");

            response.getWriter().println("<center>");
            response.getWriter().println("Pet Selection Not Done");
            response.getWriter().println("</center>");
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
                        /*response.setContentType("text/html");
                        PrintWriter out = response.getWriter();

                        out.println("<center>");
                        out.println("Pet Selection Advices<br/>");
                        */

                        String color = request.getParameter("color");
                        String alignment = request.getParameter("alignment");

                        PetExpert petExp = new PetExpert();

                        List<String> pets = petExp.getPets(color);
                        Map<String, String> petImgs = petExp.getPetImgs(pets);


                        request.setAttribute("pets", pets);
                        request.setAttribute("petImgs", petImgs);
                        request.setAttribute("alignment", alignment);

                        request.setAttribute("adminEmail", getServletConfig().getInitParameter("adminEmail"));

                        RequestDispatcher view= request.getRequestDispatcher("petResult.jsp");
                        view.forward(request, response);
        }
}