package Classes;

public class TestObj {
    int a,b; 
    TestObj (int i , int j )
    {
        a = i; 
        b = j; 
                }
    
  /*(TestObj ()
  {
      a = 0; 
      b = 1; 
              }*/
  
    
    boolean equal(TestObj o)
    {
        if(o.a == a && o.b == b){
        return true; 
        }
        else 
            return false; 
        }
  TestObj obj()
  {
        TestObj ob1 = new TestObj(2, 3);    
      return ob1;
      }
}
