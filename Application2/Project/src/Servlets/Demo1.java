//package Servlets;
import java.io.*;

import java.util.Enumeration;

import javax.servlet.*;
//MIME Multi purpose Mail Extension

public class Demo1 extends GenericServlet {

    public void service(ServletRequest servletRequest,
                        ServletResponse servletResponse) throws ServletException, IOException {
        
        servletResponse.setContentType("text/plain;charset=UTF-8"); // means brwoser should interpret contect as HTML
      //  readservlet(servletRequest);
        System.out.println("checking the flow");
        PrintWriter pw = servletResponse.getWriter(); // get printwriter 
        Enumeration e = servletRequest.getParameterNames(); 
        while(e.hasMoreElements())
        {
              
            String pname = (String)e.nextElement();
            System.out.println("Inside while loop" + pname);
            pw.print(pname + "=");
            String pvalue = servletRequest.getParameter(pname); 
            pw.println(pvalue); 
              
            }
        
      pw.println("Remote address" + servletRequest.getRemoteAddr() + servletRequest.getRemoteHost());
        //PrintWriter pw = servletResponse.getWriter(); // is used to write HTML source code as HTTP response
        //pw.println("Hello world"); 
        pw.close(); 
       
       //Demo2 dm = new Demo2();
       //dm.doPost(servletRequest, servletResponse);
       RequestDispatcher rd = servletRequest.getRequestDispatcher("Demo2");
       rd.forward(servletRequest,servletResponse);
        
    }
   /* public ServletResponse readservlet(ServletRequest servletRequest)    
  ServletResponse response = new ServletResponse; 
    {
        System.out.println("Printing the values of the servlet");
        PrintWriter pw = response.getWriter();
        Enumeration e = servletRequest.getParameters();
        while (e.hasMoreElements())
        {
         String pname = (String)e.nextElement(); 
            
            }
          return servletResponse;                                          
        }*/
    
}
