package ServletJDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Types;

import java.util.Enumeration;

import java.util.Properties;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oracle.jdbc.driver.*;

public class ServletEntry extends HttpServlet {
    public void doPost(HttpServletRequest req,
                       HttpServletResponse resp) throws ServletException,
                                                        IOException {

        Enumeration e = req.getParameterNames();
        String pname, pvalue;
        while (e.hasMoreElements()) {
            pname = (String)e.nextElement();
            pvalue = req.getParameter(pname);

        }


    }

  /*  public  Properties loadprop()  {
        try {
            FileInputStream fb = new FileInputStream("d:/DBprop.txt");
            Properties prop = new Properties();
            prop.load(fb);
            return prop;
        } catch (ClassNotFoundException e) {
            System.out.println("Failed" + e);
        }
        catch(FileNotFoundException ee)
        {
               System.out.println("Failed" + ee);
               }
      catch(IOException ee)
      {
             System.out.println("Failed" + ee);
             }
        finally {
              System.out.println("Failed" );
            }
      
    }*/
    
  /*  public boolean connectDB(Properties prop, String pvalue) 
                                   {
        return true; 
       /* try {
          DriverManager.registerDriver((Driver)new oracle.jdbc.driver.OracleDriver());
            String url;
            String query = "Select * from dual"; 
            ResultSet results; 
            String sql = "Pr_test(?)"
            Connection db = DriverManager.getConnection(url, prop);
            if (pvalue == "P"){
            PreparedStatement pw = db.prepareStatement(query); 
            results = pw.executeQuery();
            pw.close();
            }
            else (pvalue == "C"){
                     
            CallableStatement cc = db.prepareCall(sql); 
            cc.registerOutParameter(1, Types.Varchar); 
            
                         }
        }
        
        catch(ClassNotFoundException e )
        {
            System.out.println("Failed for class not found" + e);
            return false; 
            }
        catch(SQLException ee)
        {
              System.out.println("Failed for Sql exception" + ee);
              return false; 
            }
        return true; 
        }*/
}

