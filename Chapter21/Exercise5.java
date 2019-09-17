import java.util.Scanner;
import java.util.Random;

public class Exercise5
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int x;
        Random rnd = new Random();
        int y = rnd.nextInt(10);
        int z = rnd.nextInt(10);


        System.out.println("What is " + y + " * " + z + ":");
        x = scan.nextInt();

        if (x == y*z) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect:(");
        }

    }
}