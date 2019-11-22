import java.util.Scanner;

public class Exercise1
{
  public static void main ( String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    String inChars;

    int usersel;
    int useramt;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16 );

    System.out.println(goose);
    System.out.println(apple);
    System.out.println(rhub);

    System.out.println("Enter your selection (1, 2, or 3): ");
    usersel = scan.nextInt();
    while (usersel > 3 || usersel < 1) {
        System.out.println("Error: out of range.");
    }
    System.out.println("Enter amount to spread:");
    useramt = scan.nextInt();
    System.out.println("Spreading" +" fluid ounces of " );
  }
}