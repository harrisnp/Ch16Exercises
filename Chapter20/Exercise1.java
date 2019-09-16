import java.util.Scanner;

public class Exercise1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int how;
        int many = 0;
        int sum = 0;



        System.out.println("How many integers will be added: ");
        how = scan.nextInt();

        while (many < how) {
            System.out.println("Enter and Integer: ");
            sum = scan.nextInt() + sum;
            many = many + 1;
        }

        System.out.println("The sum is " + sum);
    }
}