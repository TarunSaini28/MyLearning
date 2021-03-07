package Exceptions;

public class TestDemo {
    public static void main(String[] args) {
        Test test = new Test();
        try {
        test.div(12, 1);
        }
        catch (RuntimeException e )
        {
        System.out.println("Handling the exception" + e); 
            }
        String arg[] =  {"re" , "er"}; 
        test.prnt(arg, 12);
    }
}
