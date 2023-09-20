import java.util.Random;
import java.util.Scanner;
public class nogame
{     
    public static void main(String args[])
   {
      int randomnumber;
      int playerguess;
      int trycount;
      Random rand=new Random();
      Scanner sc=new Scanner(System.in);
      randomnumber=rand.nextInt(100) + 1;
      //System.out.println("Random number is"+randomnumber);
      trycount=0;
     while(true)
     {
        System.out.println("Enter your guess between range(1-100)");
        playerguess=sc.nextInt();
        trycount++;
        if(playerguess==randomnumber)
        {
           System.out.println("Correct! you win!");
           System.out.println("It took you " +trycount +" tries");
           break;
        }
        else if(randomnumber>playerguess)
        {
             System.out.println("Nope!The number is higher.Guess again.");
        }
        else
        {
           System.out.println("Nope!The number is lower.Guess again.");
        }
        
    }
    System.out.println("Random number was "+randomnumber);
  }
}