package Interface;

public class TestInt {
    public static void main(String[] args) {
        TestInt testInt = new TestInt();
        IntDemo in = new IntDemo();
        System.out.println("Testing interfaces" + in.flag(12, 12));
     // System.out.println("Testing interfaces" + in.test);
      in.mult(12, 12); 
      System.out.println("Testing interfaces" + in.febna(5));
      
      //in.test = 90;  becomes a final variable hence cannot assign values ;
    }
    
}
