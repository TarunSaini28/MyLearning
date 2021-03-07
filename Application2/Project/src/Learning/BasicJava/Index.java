package Learning.BasicJava;

public class Index {
    public static void main(String[] args)
    {
        int spcs = 0; 
        int i = 0; 
          boolean  checkstatus = true;  
        String str = "The quick brown fox jumps over the lazy dog twice ";
         //spcs =  str.indexOf( ' ',i) ; 
         
          while(checkstatus == true)
          {
                i = str.indexOf( ' ',i) + 1; 
                spcs =spcs +1; 
              if (str.indexOf( ' ',i) < 0 ){
                checkstatus = false; 
              } 
              }
         System.out.println("Spaces are " + spcs); 
        
        
        }
}
