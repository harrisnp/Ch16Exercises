import java.util.Scanner;

public class Exercise2
{
    public static void main(String[]args)
    {
        int inData;
        Scanner scan = new Scanner ( System.in);
        int solved;
        int solved2;

        System.out.println("Input the cents:");
        inData = scan.nextInt();
        solved = inData / 100;
        solved2 = inData % 100;

        System.out.println("That is " + solved + " dollars and " + solved2 + " cents.");
    }
}