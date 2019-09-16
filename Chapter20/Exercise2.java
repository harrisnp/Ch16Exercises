import java.util.Scanner;

public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int n;
        int sum = 0;



        System.out.println("Enter n: ");
        n = scan.nextInt();

        while (many < n) {
            sum = 1/n + sum;
            n = n + 1;
        }

        System.out.println("The sum is " + sum);
    }
}