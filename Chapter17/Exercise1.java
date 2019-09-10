import java.util.Scanner;

public class Exercise1
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        String item = new String();
        double price;
        double delivery;
        double total;

        System.out.println("Enter the item: ");
        item = scan.nextLine();
        System.out.println("Enter the price (cents): ");
        price = scan.nextDouble() / 100; 
        System.out.println("Overnight delivery (0==no, 1==yes) ");
        delivery = scan.nextDouble();

        if ( delivery == 1 && price < 10){
            total = price + 2;

        } else if (delivery == 1 && price > 10 ) {
            total = price;
        } else {
            total = price + 3;
        }

        System.out.println("Item: " + item);
        System.out.println("Total = $" + price);
        if (delivery == 1){
            System.out.println("Delivery? Yes");
        } else {
            System.out.println("Delivery? No");
        }
        System.out.println("Total = $" + total);
    }
}