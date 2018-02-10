package com.example.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by parsecer on 15.10.2017.
 */
public class FileReturn extends HttpServlet {
                public FileReturn()  {

                }

                public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

                                String fileType = request.getParameter("fileType");

                                String contentType;
                                String fileName;
                                if (fileType.equals("pdf"))  {
                                            fileName="/letter.pdf";
                                            contentType="application/pdf";
                                }
                                else if (fileType.equals("jar")) {
                                            fileName="/jsoup.jar";
                                            contentType="application/jar";
                                }
                                else  {
                                            fileName = "/picture.jpg";
                                            contentType="image/jpeg";
                                }

                                response.setContentType(contentType);

                                ServletContext context = getServletContext();
                                InputStream input = context.getResourceAsStream(fileName);

                                int read=0;
                                byte[] bytes = new byte[1024];

                                OutputStream output = response.getOutputStream();
                                while ((read=input.read(bytes))!=-1)  {
                                        output.write(bytes, 0, read);
                                }

                                output.flush();
                                output.close();
                }


}
