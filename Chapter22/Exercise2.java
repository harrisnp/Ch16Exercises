import java.util.Scanner;
import java.util.Random;

public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int x;
        int y;
        int z;
        int a;
        


        System.out.println("Initial miles: ");
        x = scan.nextInt();

        System.out.println("Final miles: ");
        y = scan.nextInt();

        System.out.println("Gallons");
        z = scan.nextInt();

        a = (y - x) / z;

        System.out.println("Miles per Gallon: " + a);

    }
}