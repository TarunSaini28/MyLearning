package Learning;

public class OverloadOb {
    public static void main(String[] args) {
        Overload ob1 = new Overload(100, 22);
       // Overload ob2 = new Overload(100, 22);

        //System.out.println("Tarun printing " + ob1.equals(ob2));
        //System.out.println("Tarun printing mult" + ob1.mult(ob1));
        //System.out.println("Tarun printing mult" + ob1.test());
      Overload ob3 = ob1.test(); 
      System.out.println("Tarun printing ob3 values " + ob3.a);
    }
}
