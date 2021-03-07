package Exceptions;

public class Test implements Interface1 {
 public void div (int a, int b ) throws RuntimeException
  {
       System.out.println("Trying to divide two numbers" + a/b);
       throw new RuntimeException();
       
          
      }
  
 public void prnt (String [] a, int b )
  {
      try {
           System.out.println("Printing the char of a string" ); 
          
          }
      catch(Exception e ){
            System.out.println("Failing if string is out of index" + e ); 
          
          }
      finally {
            System.out.println("Executing finally" ); 
          }
      }
  public int str (int a, int b , int c ){
      //  System.out.println("Mult of three numbers " ); 
      return a * b * c; 
      
      }
}
