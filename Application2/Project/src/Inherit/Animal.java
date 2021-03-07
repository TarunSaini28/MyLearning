package Inherit;

 public  class Animal  {
    public static int age; 
    public int age_new = 10;
    
    //parameterized constructor 
    public Animal(int age ){
        //super(); 
        this.age= age; 
          printage();
        }
    //non-parameterized
  public Animal(){
      //super(); 
      this.age= 1; 
      }
    public void printage()
    {
        System.out.println("Printing super age " + age); 
        }
}

