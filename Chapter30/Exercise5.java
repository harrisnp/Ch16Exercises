import java.util.Scanner;
import java.util.Random;

public class Exercise5
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();    
        int j = 0; 

        System.out.println("Your password must have at least 5 characters.");
        System.out.print("What is your password ");
        String pass = scan.nextLine();

        String password = "";

        boolean correct = false;
        int tries = 0;

        // Randomly pick characters from the string
        while (!correct){
            tries+= 1;
            String current = "";

            int i = 0;

            while (i <=5){
                i = i + 1;
                if (current.equals(pass)) {
                    correct = true;
                    password = current;
                }
                char x = (char)(rand.nextInt(26) + 'a');
                current = current + x;
            }
        }
            System.out.println("Your password is " + password + " and it took " + tries + " tries.");
        
    }
}