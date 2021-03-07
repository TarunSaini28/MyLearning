package bank;

public class AccountClass {
    //instance variables
    static int accountId ; //moves the accountid to heap, so that all classes can use this value
    String holdersName ; 
    double balance; 
    
    //constructor 
    public AccountClass  (/*int accountId,*/ String holdersName, double balance)
    {     this.accountId = accountId + 1; 
          this.holdersName = holdersName; 
          this.balance = balance; 
        
        }
  // initializer method
    public void intializer(int accountId, String holdersName, double balance){
          this.accountId = accountId; 
          this.holdersName = holdersName; 
          this.balance = balance; 
          
        }
  // display method  
    public void displayaccountdetails(){
        System.out.print("Checking the value of accountid" + accountId); 
          System.out.print("Checking the value of holdersName" + holdersName); 
          System.out.print("Checking the value of balance" + balance); 
        }
    
    public void setholdersName(String holdersName)
    {
        if(holdersName=="" || holdersName.length() == 0 || holdersName==" ")
        {System.out.println("Holders name is null "); }
        else 
        this.holdersName = holdersName; 
        }
    
    public double getbalance()
    {
       return this.balance;
        }
    
    public int Switch(int a )
    {
        String s = null; 
        System.out.print(s); 
        switch(a){
       // default : 
        case 1 : a = 7; 
        //break; 
        case 2 : a = 9;
        //break;         
        case 3 : a = 5; 
        //break; 
        default : a = 123;
        }
        return a; 
        }

    public static void setAccountId(int accountId) {
        AccountClass.accountId = accountId;
    }

    public static int getAccountId() {
        return accountId;
    }

    public void setHoldersName(String holdersName) {
        this.holdersName = holdersName;
    }

    public String getHoldersName() {
        return holdersName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
