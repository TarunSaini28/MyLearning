package Learning;

public class InitializationOrder {
    private static String name = "tarun";
  static{new InitializationOrder();}
    static{System.out.println("Printing Static variable " + name);}
    {System.out.println("Printing Instance variable " + name);}     
    
    private InitializationOrder ()
    {System.out.println("Inside Constructor");
        }
    
    public static void main(String[] args) {
      System.out.println("Inside Main");
        InitializationOrder initializationOrder = new InitializationOrder();
    }
}
