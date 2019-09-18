import java.util.Scanner;
import java.util.Random;

public class Exercise4
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int x;

        System.out.println("Enter X:");
        x = scan.nextInt();

        System.out.println(Math.exp(x));
    }
}