package Learning;

public class Test_Access_Pkg {
    public static void main(String[] args) {
        Test_Access_Pkg test_Access_Pkg = new Test_Access_Pkg();
        Class_Access cb = new Class_Access(); 
        cb = null; 
      System.out.println("The value of static" + cb.a + Class_Access.NAME_VA);
      Class_Access.call1();
      System.out.println("The value of static" + cb.a + cb.NAME_VA + cb.b);
      cb.call1();
    }
}
