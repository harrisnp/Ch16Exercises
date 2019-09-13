import java.util.Scanner;

public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int n;
        int sum;
        int num;

        System.out.println("Enter N");
        n = scan.nextInt();

        num = (n*(n+1))/2;
        System.out.println("Formula Sum = " + num);

        while (num >= 1 && num <= n) {
            num = (num + 1) + num;
            System.out.println("Loop Sum = " + num);
        }        
    }
}