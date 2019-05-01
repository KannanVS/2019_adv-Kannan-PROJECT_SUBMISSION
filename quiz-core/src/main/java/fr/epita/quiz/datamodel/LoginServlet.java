package fr.epita.quiz.datamodel;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@SuppressWarnings({ "serial", "restriction" })
public class LoginServlet extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response)
                                   throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String name = request.getParameter("a");
    String pass = request.getParameter("b");
    System.out.println(name);
  }
}