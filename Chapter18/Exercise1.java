import java.util.Scanner;

public class Exercise1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);;
        double ca;
        double sa;
        double total;

        System.out.println("Enter amount in Checking: $");
        ca = scan.nextDouble();
        System.out.println("Enter amount in savings: $");
        sa = scan.nextDouble() / 100;
        total = ca + sa;

        if (ca > 1000 || sa > 1500) {
            System.out.println("No sevice charge");
        } else {
            System.out.println("Service charge = $0.15 per check");
        }

    }
}