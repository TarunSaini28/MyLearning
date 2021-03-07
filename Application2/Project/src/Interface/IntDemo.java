package Interface;

public class IntDemo /* implements Interface2, Interface1 */{

public static void main(String args[])
{
    System.out.println("Printing the interface val" + Interface1.test);
    }
    public  boolean flag(int a, int b) {
        try {
            if (a > b) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Exception raised" + e);
            return false; 
        }

    }

    public void mult(int a, int b) {
        System.out.println("Mult is " + a * b);
    }
    
  int febna (int j)
  {
      int c =0;
      int k =0; 
      for(int i=0; i <= j; i++)
      {
          if (i ==0 ) 
            c = c + k; 
          
            k = c; 
          }
        System.out.println("Printing the value " + c); 
        return c; 
      }
  String test(String arg)
  {
      return null; 
      }
  

}
