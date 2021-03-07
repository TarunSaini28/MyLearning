package Learning;
import java.util.*;
import java.io.EOFException;
//import java.array.*;
import java.util.ArrayList;
public class Exam_Prep {
   // public int main(String [] args) {}
    
    public static void main(String args) {
      //  double x = 10,  y ; 
        Exam_Prep exam_Prep = new Exam_Prep();
  // String Builder
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "love";
        s1.append(s2);
        
        System.out.println("Checking the result after append" + s1);
        String s3 =  s1.substring(4);
        System.out.println("Checking the result after substring" + s1 + ":" + s3);
        s1.indexOf(s2);
        System.out.println("Checking the result after index of " + s1);
     
     //Arthmatic Exception
        
     int x = 10;
      int y = 2;
      try {
      for (int z = 2; z >= 0; z--) {
      int ans = x / z;
     System.out.print(ans+ " ");
      }
      }  catch (ArithmeticException  e2) {
         System.out.println("E2");
      }
      catch (Exception e1) {
           System.out.println("E1");
           }

//String functions
      String a= "abc"; 
      String b = a.toUpperCase(); 
      System.out.println("a is " + a); 

        
    }
    
 //Array
    String str[] = new String[3]; 
    String[] str1 =  {"tarun", "kumar","saini"}; 
   // int[] Int =  Int{1,2,3}; 
}
