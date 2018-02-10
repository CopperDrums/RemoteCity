<%@ page import = "java.util.*" %>

<html>
    <body>
            <h1 align="center">Choosing a pet gift</h1>

            <p>
                    <%
                            List styles = (List) request.getAttribute("pets");
                            String[] parameters = request.getParameterValues("parameters");
                            Map<String, String> petImgs = (Map) request.getAttribute("petImgs");

                            Iterator iter = styles.iterator();
                            while (iter.hasNext())  {
                                        out.println("<center>");
                                        out.println("<br>" + iter.next());
                                }
                                out.println("<br/>");

                                for (String value: petImgs.values())  {
                                    out.println("<img src=\"" + value + "\"/>");
                                }


                                out.println("<br/><br/><br/><br/><br/>");
                                out.println("<h2>Other pet info:</h2>");

                                out.println("<br/><b>Alignment:</b> " + request.getAttribute("alignment"));
                                out.println("<br/><b>Other features:</b> " + parameters[0] + ", " + parameters[1]);
                                out.println("<br/><b>Profession:</b> "+parameters[2]);


                                out.println("<br/><br/><br/><br/><br/>");
                                out.println("<a href=\"form.html\">GO BACK TO FORM</a>");
                                 out.println("</center>");

 out.println("<br/><br/><br/><br/><br/>");
                                 out.println(getServletContext().getInitParameter("adminPlanet"));
                                 out.println(", ");
                                 out.println(request.getAttribute("adminEmail"));
                    %>
            </p>
    </body>
</html>
