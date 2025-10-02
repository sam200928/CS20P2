package Mastery;

import java.util.Scanner;
public class eggCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();
        if (eggs < 0) {
            System.out.println("Try again dummy.");
            input.close();
            return;
        }
        int dozen = eggs / 12;
        int extraEggs = eggs % 12;
        double pricePerDozen;
        if (dozen < 4) {
            pricePerDozen = 0.50;
        } else if (dozen < 6) {
            pricePerDozen = 0.45;
        } else if (dozen < 11) {
            pricePerDozen = 0.40;
        } else {
            pricePerDozen = 0.35;
        }
        double totalCost = dozen * pricePerDozen + extraEggs * (pricePerDozen / 12);
            System.out.printf("The total cost for %d eggs is = $%.2f%n", eggs, totalCost);

            input.close();
 
    }
}

/*
Enter the number of eggs purchased: 18
The total cost for 18 eggs is = $0.75
*/