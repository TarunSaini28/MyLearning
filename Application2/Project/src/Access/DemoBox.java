package Access;

import Classes.Box;

public class DemoBox extends Box  {
    public static void main(String[] args) {
        DemoBox demoBox = new DemoBox();
        /*
        Box bt = new Box();
        bt.height = 100; 
        bt.depth = 23;
        bt.width = 34; 
        
        System.out.println("Volume of the box is " + (bt.height * bt.depth * bt.width ));
        
      Box bt1 = new Box();
      bt1.height = 100; 
      bt1.depth = 203;
      bt1.width = 34; 
      
      System.out.println("Volume of the box is " + (bt1.height * bt1.depth * bt1.width ));
      
      bt1.height = 1000; 
      bt1.depth = 203;
      bt1.width = 34; 
      
      System.out.println("Volume of the box is " + (bt1.height * bt1.depth * bt1.width ));  
      */
      Box b2 = new Box(); 
      b2.height = 1000; 
      b2.depth = 203;
      b2.width = 34; 
      b2.test(); 
     // System.out.println("Volume of the box is " + b2.volume());  
      //System.out.println("Volume of the box is " + b2.volume());  
    }
   
}
