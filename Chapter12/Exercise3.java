import java.util.Scanner;

public class Exercise3
{
    public static void main(String[]args)
    {
        int inData;
        Scanner scan = new Scanner ( System.in);
        int solved;
        int cents;
        int quarters;
        int dimes;
        int nickles;
        int pennies;

        System.out.println("Input the cents:");
        inData = scan.nextInt();
        solved = inData / 100;
        cents = inData % 100;
        quarters = (inData % 100) / 25;

        dimes = ((inData % 100) - (quarters * 25)) / 10;
        nickles = ((inData % 100) - (quarters * 25) - (dimes * 10)) / 5;
        pennies = ((inData % 100) - (quarters * 25) - (dimes * 10) - (nickles * 5));

        System.out.println("That is " + solved + " dollars and " + cents + " cents.");
        System.out.println("You get " + solved + " dollars, " + quarters + " quarters, "
         + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies.");
    }
}