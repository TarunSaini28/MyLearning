package Abstract;

import java.math.BigDecimal;

public class Bird extends Swan{
    public static void main(String[] args )
    {
        char t = 'q'; 
        int test = 1234; 
        Swan db = null;
        Bird br = new Bird(); 
        System.out.println("Calling " + br.getname()); 
//          br.forMult(); for loop
      //  br.$test();
        //br.checkvar();
        br.checkvar();
        
        }
    public int  getage()
    {
        return 3; 
        }
    
  public String getname(){
          System.out.println("Inside getname"); 
          return "Swan"; 
          }
  
  public void forMult()
  {
      int a ;
      int b ; 
      outerloop: for(int aa = 1; aa < 3 ; aa++ )
      {
          System.out.println("Inside outer loop" + aa); 
          innerloop: for( b = 1; b< 3; b++ )
          {
                System.out.println("Inside inner loop" + b ); 
              if(b==2) 
              { 
                System.out.println("Before breaking inner loop"); 
                  
                  break innerloop;
              }
              else {
                System.out.println("Before continue inner loop"); 
                  continue innerloop;
              }
              }
          if (aa==2) 
          {
            System.out.println("Before breaking outer loop"); 
              break outerloop; 
          }
          }
      }
  
  public void testing(){
      byte a = 1; 
      byte b = 2; 
      // as a & b are converted to an integer coversion to smaller datatype needs casting
    //  byte c = a + b; 
     //   short d = a + b; 
        int z = a + b; 
        long q = a + b; 
        double s = a + b; 
        float x =  a + b; 
      }
    
  public void $test(){
      int x = 12; 
       int y = 121;         
       int z = x++; 
       System.out.println("checking z" + z); 
  System.out.println("checking x" + x); 
  System.out.println("checking z after x" + z); 
}
  public void casting(){
      long y = 2; 
      int x = (int)2 * (int)y; 
      short b = 2;
      int a = 2* b; 
      }
  
  public void foreach()
  {
      Integer sr[] = {10,14};
      for(int b : sr)
      {
          System.out.println("checking the values " + b); 
          
          }
      String str[]={"tarun", "saini"};
      for (String s : str)
      {
          if (s == "tarun")
            System.out.println("its tarun"); 
          else
            System.out.println("its saini"); 
          }
      }
  
  public void checkvar()
  {
        BigDecimal txnAmtfromXML1 = null;
        BigDecimal txnAmtfromXML2 = null;
        BigDecimal txnAmtfromXML3 = null;
        txnAmtfromXML1 = new BigDecimal(2.0);
        txnAmtfromXML2 = new BigDecimal(2.0);
        txnAmtfromXML3 = txnAmtfromXML2; 
        System.out.println("are references equal" + (txnAmtfromXML1 == txnAmtfromXML2)); 
        System.out.println("are references equal" + (txnAmtfromXML3 == txnAmtfromXML2)); 
        //int i = 1 = 1; 
      boolean z= true, q = false;
      int a = 23; 
      q = (a!=0)^(z=false); 
        System.out.println("its saini " + q); 
        int w = 5*4%3; 
        System.out.println("its saini " + w); 
      }
  
}

