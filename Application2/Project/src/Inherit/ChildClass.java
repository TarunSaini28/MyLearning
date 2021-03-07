package Inherit;

public class ChildClass extends MainClass {
    public static void main(String[] args) {
        System.out.println("Inside main of child class"); 
        ChildClass childClass = new ChildClass();
    }
    public ChildClass (){
          System.out.println("Inside constructor of childclass"); 
        }
}
