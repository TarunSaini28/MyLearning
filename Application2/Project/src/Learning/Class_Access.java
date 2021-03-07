package Learning;
import java.lang.*; 


 public  class Class_Access {
 public   int a = 0; 
  protected final static int NAME_VA = 2; //default access, only in the package 
  protected final static StringBuilder NAME_1 = new StringBuilder("tarun"); 
  
  static protected final int room = 4; 
  int b = 5; 
  private  String c = "test";
  
  protected void test() {
    }; 
  void test(int a ){};
  int test(int a, int b )
    {
      return 1;} 
  
  private void call() {
      System.out.println("checking the call from caller");
      }; 
      
  final protected  static void call1(){
        System.out.println("checking the call for protectef from caller");
      }    
  
  public void call2(){
      System.out.println("checking the call for public from caller");}
  
  
}
