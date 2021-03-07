package bank;

public class Test_Class {
    public static void main(String[] args) {
    /*    //AccountClass Test = new AccountClass();
        AccountClass Test = new AccountClass("Tarun", 1200);        
        //Test.intializer(234, "Tarun", 1200);
        Test.displayaccountdetails();
        
        AccountClass Test1 = new AccountClass("Tarun Saini", 200);
        Test1.setholdersName(" ");
        Test1.displayaccountdetails();
      System.out.println( Test1.getbalance() + 1000); */
        
      AccountClass Test1 = new AccountClass("Tarun Saini", 200);
      System.out.println("checking the value of a " + Test1.Switch(1)); 
    }

}
