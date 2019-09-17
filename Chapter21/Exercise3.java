import java.util.Scanner;

public class Exercise3
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int n;
        int x;
        int m = 1;
        double ans;

        System.out.println("Enter X: ");
        x = scan.nextInt();

        System.out.println("Enter N: ");
        n = scan.nextInt();

        ans = x; 

        while (m < n) {
            ans = ans * x;
            m = m + 1;
        }

        System.out.println(x + " raised to the power of  " + n + " is " + ans);
    }
}