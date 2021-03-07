package Inherit;

public class MainClass {
      public int a ; 
    public MainClass(){
        this(5);
          System.out.println("Inside constructor of Mainclass ");
        }
  public MainClass(int a){
      System.out.println("Initializing a ");
    a = this.a; 
      } 
  
}
