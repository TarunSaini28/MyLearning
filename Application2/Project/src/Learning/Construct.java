package Learning;

public class Construct {
    private static  int a = 1; 
    private static String s = "tarun";
    private static int b = 2; 
    public Construct(int a , int b ){
          System.out.println("Calling overloaded constructor"); 
        this.a = a;
        this.b = b; 
    
        }
  private Construct(int a){     
      new Construct(a , 100 ); 
        System.out.println("Calling private constructor"); 
      }
    public static void main(String[] args) {
     /* System.out.println("Value of a before constructor" + a ); 
      System.out.println("Value of b before constructor" + b ); */
        //Construct construct = new Construct(3,4 );
      //System.out.println("Value of a before constructor" + construct.a ); 
      // System.out.println("Value of b before constructor" + construct.b );
     Construct tt = new Construct(122); 
      System.out.println("Value of a before constructor" + tt.a ); 
      System.out.println("Value of b before constructor" + tt.b );
      
    }
}
