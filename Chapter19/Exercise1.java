import java.util.Scanner;

public class Exercise1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int start;
        int end;
        int num;

        System.out.println("Enter start:");
        start = scan.nextInt();
        System.out.println("Enter end");
        end = scan.nextInt();

        num = start;
        while (num >= start  && num <= end) {
            System.out.println(num);
            num = num + 1;
        } 
        
    }
}