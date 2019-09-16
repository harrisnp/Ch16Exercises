import java.util.Scanner;

public class tax
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        double salary;
        double tax = 0;
        double percentage = 0;

        System.out.println("Input your salary: $");
        salary = scan.nextDouble();

        if (salary < 15000) {
            tax = 0;
        } else if (salary >= 1500 && salary < 35000) {
            tax = (salary - 15000) * .10;
        } else if (salary >= 35000 && salary <65000) {
            tax = ((salary - 35000) * .16) +2000;
        } else if (salary >= 65000 && salary <105000){
            tax = ((salary - 65000) * .19) + 6800;
        } else if (salary > 105000) {
            tax = ((salary - 105000) * .22)+ 14400;
        }

        percentage = Math.round((tax / salary) * 100);

        System.out.println("You must pay $" + tax + " in taxes this year.");
        System.out.println("The percentage of your salary going to taxes is " + (percentage) + "%");
    }
}

