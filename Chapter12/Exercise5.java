import java.util.Scanner;

public class Exercise5
{
    public static void main(String[]args)
    {
        String str = new String ("Eva, can I stab bats in a cave?");
        
        Scanner scan = new Scanner(System.in);
        int begin;
        int end;
        float input;

        System.out.println("Enter String");
        input = scan.nextLine();

        
        System.out.println("Enter beginning index:");
        begin = scan.nextInt();

        System.out.println("Enter ending index");
        end = scan.nextInt();

        String sub = str.substring(begin,end);

        System.out.println(str);


        System.out.println(sub);

        
        }
}