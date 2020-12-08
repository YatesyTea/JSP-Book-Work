package Controller;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 * @author Yates
 * @date 08/12/2020
 */

public class BeerSelect extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Beer Selection Advice<br>");
        String c = request.getParameter("color");
        out.println("<br>Got Beer Colour " + c);
    }
}
