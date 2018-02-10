package servlets;//<?xml version="1.0" encoding="UTF-8" ?>

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


/**
 * Created by parsecer on 28.09.2017.
 */
public class DiceRollServlet extends HttpServlet  {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
                        PrintWriter out = response.getWriter();

                        Random rand = new Random();

                        out.println("<p>Your random numer is: " + rand.nextInt(100) + "</p>");
              //  out.println("<p>Hello2</p>");
            }

            public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
                {
                    PrintWriter out = response.getWriter();
                    out.println("<p>Hello</p>");
                }


            public DiceRollServlet()  {

            }

}
