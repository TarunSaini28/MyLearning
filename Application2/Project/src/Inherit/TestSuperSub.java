package Inherit;

public class TestSuperSub {
       
    public static void main(String[] args) {
        Sub sb = new Sub(23, 34,45,56); 
        System.out.println("Volume is : " + sb.volume()); 
        System.out.println("Weight is : " + sb.weight); 
        
       Sub sb1 = new Sub(); 
      sb1 = sb; 
      test(sb1);
           
    }
    
    public static void test(Sub b)
    {
          System.out.println("Volume is : " + b.volume()); 
          System.out.println("Weight is : " + b.weight); 
          
        }
}
