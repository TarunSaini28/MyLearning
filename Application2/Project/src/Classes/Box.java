package Classes;

public class Box {
   public double height;
   public double width;
   public double depth; 
   public Box(double w, double b, double l){
       System.out.println("Intializing using constructor" + w + l + b);
       /*this.width = w;
       this.height= l;
       this.depth = b;*/
       width = w;
       height= l;
       depth = b;
         System.out.println("Volume using constructor" + volume());
       }
   
  public Box(){
      System.out.println("Intializing using default constructor" );
      /*this.width = w;
      this.height= l;
      this.depth = b;*/
      width =1;
      height= 2;
      depth = 3;
        System.out.println("Volume using constructor" + volume());
      }
  
   protected double volume (){
       return height * width * depth; 
       }
   public void test()
   {
       System.out.println("checking the private"); 
       }
}
