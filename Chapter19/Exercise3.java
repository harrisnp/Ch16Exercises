import java.util.Scanner;

public class Exercise3
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        String first = new String();
        String second = new String();
        String dot = new String();
        int n;

        System.out.println("Enter first word: ");
        first = scan.nextLine();

        System.out.println("Enter second word: ");
        second = scan.nextLine();

        n = first.length() + second.length();

        System.out.println(first);

        while (first.length() + second.length() + dot.length() < 30) {
            System.out.println(".");
            dot = dot + 1;
        }        

        System.out.println(second);
    }
}