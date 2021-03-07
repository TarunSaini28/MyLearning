package Learning;

public class Pass_value {
    public static void main(String[] args) {
        Pass_value pass_value = new Pass_value();
        String num = "2"; 
        test(num.concat("3")) ; 
      System.out.println("printing the values" + num); 
      
     
      StringBuilder sb = new StringBuilder("Tarun"); 
      speak(sb); 
     // System.out.println("Printing value of string builder" + sb); 
    }
    public static void test (String t ){
       int num= 3; 
       
        System.out.println("printing the values" + num); 
        }
    public static void speak(StringBuilder sb )
    {
        sb.append(" Saini"); 
        }
}
