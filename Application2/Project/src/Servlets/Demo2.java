import javax.servlet.http.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public class Demo2 extends HttpServlet{
    public void toGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String color = req.getParameter("color");
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("Color selected is " + color); 
        pw.close();
        
        }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        /*System.out.println("Request is forwarded here");
      String color = req.getParameter("color");
      resp.setContentType("text/html");
      PrintWriter pw = resp.getWriter();
      pw.println("Color selected is " + color); 
      pw.close();*/
        RequestDispatcher rd = req.getRequestDispatcher("Demo3");
        rd.forward(req,resp);
      
    }
}