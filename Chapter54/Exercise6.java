import java.util.Scanner;

public class Exercise6 {

	static int factorial(int n) {
        if (n == 0)
            return 1;
        else 
              return(n* factorial (n-1));
        
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i, fact, fact2 = 1;
        System.out.println("Enter a number");
        int number = scan.nextInt();

        System.out.println("Enter another number: ");
        int number2 = scan.nextInt();

        fact = factorial(number);
        fact2 = factorial(number2);
        System.out.println("Factorial of " + number + " is: " + fact);

        if (fact > 20 || fact2 > 20) {
            System.out.println();
        }

            }
        } 			

