package Mastery;
import java.util.Scanner;
public class paperCopies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter the number of copies to be printed: ");
        int copies = input.nextInt();
        double pricePerCopy;
        
        if (copies >= 0 && copies <= 99) {
            pricePerCopy = 0.30;
        } else if (copies >= 100 && copies <= 499) {
            pricePerCopy = 0.28;
        } else if (copies >= 500 && copies <= 749) {
            pricePerCopy = 0.27;
        } else if (copies >= 750 && copies <= 1000) {
            pricePerCopy = 0.26;
        } else if (copies > 1000) {
            pricePerCopy = 0.25;
        } else {
            System.out.println("Try again dummy.");
            input.close();
            return;  
        }
        
        double totalCost = copies * pricePerCopy;
        
        System.out.printf("The price per copy is = $%.2f%n", pricePerCopy);
        System.out.printf("The total cost for %d copies is = $%.2f%n", copies, totalCost);
        
        input.close();
    }   
}
/*
Enter the number of copies to be printed: 1001
The price per copy is = $0.25
The total cost for 1001 copies is = $250.25
*/
