import java.util.Scanner;

public class Exercise2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        String name = new String();
        double strength;
        double health;
        double luck;
        double total;

        System.out.println("Enter name:   ");
        name = scan.nextLine();
        System.out.println("Strength (1-10): ");
        strength = scan.nextDouble();
        System.out.println("Health (1-10):  ");
        health = scan.nextDouble(); 
        System.out.println("Luck (1-10): ");
        luck = scan.nextDouble();

        total = strength + health + luck;

        if (total > 15) {
            strength = 5;
            health = 5;
            luck = 5;

            System.out.println("You have give your character too many points!  Default values have been assigned: " + name +", strength: 5, health: 5, luck: 5 ");
        } else{

            System.out.println("Strength = " + strength + "Health = "+ health + "Luck = " + luck);

        }
    }
}