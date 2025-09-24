package Mastery;

import java.util.Scanner;
public class coinchangeamount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the change in cents: ");
        int cents = input.nextInt();
        int quarters = cents / 25;
        int remaining1 = cents % 25;
        int dimes = remaining1 / 10;
        int remaining2 = remaining1 % 10;
        int nickels = remaining2 / 5;
        int pennies = remaining2 % 5;
        
       
        int totalCoins = quarters + dimes + nickels + pennies;
        System.out.printf("The minimum number of coins is %d: quarters=%d, dimes=%d, nickels=%d, pennies=%d%n", 
                          totalCoins, quarters, dimes, nickels, pennies);
        
        input.close();
   
    }
}

	


