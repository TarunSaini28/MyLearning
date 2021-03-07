import javax.servlet.http.*;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;


public class Demo3 extends HttpServlet{
    

  public static void main(String[] args)
  {
  System.out.println("Inside main"); 
  }
  
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
      System.out.println("Request is forwarded to Demo3");
      String color = req.getParameter("color");
      resp.setContentType("text/html");
      PrintWriter pw = resp.getWriter();
      pw.println("Color selected is " + color); 
      pw.close();
      
    }
}