import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter a nonnegative number");	
		int usrinput = scan.nextInt();

		String binaryrep = "";
		String newrep;
		int remainder2 = 0;
		

			int remainder = usrinput % 2;
			int dividend = usrinput;
			while (dividend > 0) {
				remainder = dividend % 2;
				dividend = dividend / 2;
				remainder2 = remainder + remainder;
				newrep = binaryrep + remainder;
			System.out.println(newrep);
			 }
		
		while(remainder2 >= 2) {
			remainder2 = remainder2 / 2;
		} 
		if (remainder2 == 1) {
			System.out.println("The number you gave is odious.");
		} else  {
			System.out.println("The number you gave is evil.");
		}
			

	}



}