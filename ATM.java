import java.util.Scanner;
class account
{
    int accountNo;
    String accounttype;
    int PIN=1895;
    int balance=30000;
   void accountdetails()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account number:");
        accountNo=sc.nextInt();
        System.out.println("Enter account type:");
        sc.nextLine();
        accounttype=sc.nextLine();
   }
  void verifyPIN()
  {
       int  verifyPIN;
       Scanner sc=new Scanner(System.in);
       while(true)
       {
          System.out.println("Enter your PIN");
          verifyPIN=sc.nextInt();
           if(verifyPIN==PIN)
          {
             System.out.println("correct PIN");
             break;
          }
          else
         {
             System.out.println("please enter your correct PIN");
         }
     }
  }
   void checkbalance()
   {
    System.out.println("The balance in your account is:"+balance);
   }
   void deposit()
   {
      int amount;
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter your deposit amount");
      amount=sc.nextInt();
      balance=balance+amount;
      System.out.println("Deposit...............");
  }
  void withdraw()
  {
      int amount;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter withdraw amount:");
      amount=sc.nextInt();
      if(amount>balance)
      {
          System.out.println(" sorry insufficient balance................");
      }
      else
     {
         balance=balance-amount;
         System.out.println(" Transaction is success................");
     }
 }
  void display()
  {
     System.out.println(" **************");
    System.out.println(" Account no:"+accountNo);
     System.out.println(" Account type:"+accounttype);
  }
}
class ATM
{
   public  static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      account a1=new account();
      System.out.println("Welcome to ATM");
      a1.accountdetails();
      a1.display();
      int choice;
     while(true)
     {
       System.out.println("choose an option:");
       System.out.println("1.check balance");
       System.out.println("2.deposit");
       System.out.println("3.withdraw");
       System.out.println("4.exit");
       choice=sc.nextInt();
       switch(choice)
       {
          case 1:
                a1.checkbalance();
                break;
        case 2:
                 a1.verifyPIN();
                a1.deposit();
                break;
         case 3:
                a1.verifyPIN();
                a1.withdraw();
               break;
        case 4:
                System.out.println("Thank you for using ATM!");
                System.exit(0);
       default:
           System.out.println("wrong choice");
       }
    }
  }
}
       







     



  




















          