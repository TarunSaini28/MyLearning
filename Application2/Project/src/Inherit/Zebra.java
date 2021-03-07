package Inherit;

public class Zebra extends Animal {
    public static void main(String[] args) {
        Zebra zebra = new Zebra();
     // printage();
      zebra.printage();
      
    }
    public Zebra()
    {
        this(3); 
        }
    public Zebra(int age){
        
        super(age); 
        }
    public  void printage ()
    {
        System.out.println("Inside child printage" + age ); 
        super.printage(); 
        }
    
}

