import java.util.Scanner;

public class Exercise4
{
    public static void main(String[]args);
        Scanner scan = new Scanner (System.in);
    {
        double weight;
        double total;

        System.out.println("Weight of trash (lbs): ");
        weight = scan.nextDouble();

        total = ((weight - 200)/100) * 100;
        if (weight < 200) {
             System.out.println(" Total = $200");
        } else{
            System.out.println("Total = $" + total);
        }
    }
}