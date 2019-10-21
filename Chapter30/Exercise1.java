import java.util.Scanner;
import java.util.Random;

public class Exercise1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        int counter = 3;
        int x = rand.nextInt(10);

        System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.\nEnter a guess:");
        int y = scan.nextInt();

        while (counter != 1){
            counter = counter - 1;
            System.out.println("Incorrect :/ You have " + counter + " more tries.");
            y = scan.nextInt();
        }

        if (y == x) {
            System.out.println("Good job!");
        } else {
            System.out.println("The correct answer was " + x + ".");
        }
            
    }
}