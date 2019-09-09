import java.util.Scanner;

public class Exercise1
{
    public static void main(String[]args)
    {
        double inData;
        Scanner scan = new Scanner ( System.in);
        double solved;

        System.out.println("Input the radius:");
        inData = scan.nextDouble();
        solved = inData * inData * Math.PI;

        System.out.println("The radius is: " + inData + " The area is " + solved);
    }
}