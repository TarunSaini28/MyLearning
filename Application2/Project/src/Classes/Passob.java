package Classes;
import java.lang.*; 
public class Passob {
    public static void main(String... $n) {
        int y = 3;
        long x= 5; 
        int z = (int)x*y; 
       
       long t = 0;
       t = x * y; 
       System.out.println("checking" + t); 
       
       
       String r = "0"; 
       System.out.println( r += "2");
      
      
      
       
       
       boolean keepGoing = true;
       int result = 15, i = 10;
       do {
        // System.out.println(i);
       i--;
         System.out.println(i);
       if(i==8) keepGoing = false;
       result -= 2;
         System.out.println(result);
       } while(keepGoing);
      System.out.println(result);
      
      boolean checkstatus = true; 
      i = 1; 
      while(checkstatus)
      {
          
          System.out.println("Checking the flow inside while"); 
          checkstatus = false; 
          System.out.println("Checking the flow still inside while"); 
          
              }
       
       
       
       int a = 40, b = 50;
       byte ab = (byte)(a+b); 
       int sum = 0 ; 
        sum += ++ a ;
       int sum1 = ++sum; 
       System.out.println(sum1);
      System.out.println(sum1);
      System.out.println( );
      
      
       
       if (a==b)System.out.println("Inside case 1") ;
       else System.out.println("Inside case 2") ;
    //  else System.out.println("Inside case 3") ;
      System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
         
        
        System.out.println("value of x*y " + x*y); 
        Passob passob = new Passob();
        
       // TestObj ob1 = new TestObj(100,20);
      //TestObj ob2 = new TestObj(100,21);
        
       // System.out.println("Comparing objects :" + ob1.equal(ob2)) ; 
      TestObj ob3 = new TestObj(10,2);
      System.out.println("Returning object:" + ob3.obj()) ; 
    }
 
}
