package Classes;

public class Test {
     int x;
   static int y; 
    public Test() {
        x = 20;
        y = 10; 
        System.out.println("Inside the contractor x value::"+x);
      System.out.println("Inside the contractor y value::"+y);
    }
    
    public static void main (String args[]){
       int y= 'a';
    Test t = new Test();
    System.out.println("Inside the mein method" + y);
    t.m1(t.x, t.y); 
    System.out.println("after the m1 method:::"+t.x);
    System.out.println("after the m1 method:::"+t.y);
    
  System.out.println("Value of y :::"+y);
    
}
    public void m1(int x, int y){
        x = 30;
        this.y = 9; 
        System.out.println("Inside the m1 method::" +x );
        System.out.println("Ilocal y value::" +y ); 
        Object a = new Object(); 
        a = null; 
        m2(a); 
    }
    
  public void m2(Object o ){
      x = 30;
      int i = 1; 
      int j = 2; 
      this.y = 9; 
      if(i==1) 
      {
          System.out.println("Inside i ");
          }
      else if (j ==2) {
            System.out.println("Inside j ");
          }
      System.out.println("Inside the m1 method::" +x );
      System.out.println("Ilocal y value::" +y ); 
  }
}