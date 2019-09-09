import java.util.Scanner;

public class Exercise4
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        long V;
        long R;
        double I;

        System.out.println("input Voltage:");
        V = scan.nextLong();
        System.out.println("Resistance");
        R = scan.nextLong();

        System.out.println(I = (V + 0.0) / R);
    }
}