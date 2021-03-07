package Inherit;

public class B extends A{
  public B()
  {
      this("name"); 
      }

    public B(String a)
    {
        name = a;
        }
   
  
    void callme(){
        System.out.println("Overriding the abstract method"); 
        }
    
  void callmetoo(){
      System.out.println("Calling callmetoo of B" + name); 
        }
  private String name ; 
       
}
