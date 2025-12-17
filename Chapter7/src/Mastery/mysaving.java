package Mastery;
import java.util.Scanner;
public class mysaving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        piggybank bank = new piggybank();
        showoptions(input, bank);
    }
    private static void showoptions(Scanner input, piggybank bank) {
        int choice;
        do {
            showoptions();
            choice = input.nextInt();
            handleChoice(choice, bank);
        } while (choice != 0);
    }
    private static void showoptions() {
        System.out.println("\n1. Show total");
        System.out.println("2. Add penny");
        System.out.println("3. Add nickel");
        System.out.println("4. Add dime");
        System.out.println("5. Add quarter");
        System.out.println("6. Empty bank");
        System.out.println("0. Quit");
        System.out.print("Enter choice: ");
    }
    private static void handleChoice(int choice, piggybank bank) {
        if (choice == 1)
            System.out.printf("Total: $%.2f%n", bank.total());
        else if (choice == 2)
            bank.add(1);
        else if (choice == 3)
            bank.add(5);
        else if (choice == 4)
            bank.add(10);
        else if (choice == 5)
            bank.add(25);
        else if (choice == 6)
            bank.clear();
    }
}
class piggybank {
    private int cents = 0;
    void add(int amount) {
        cents += amount;
    }
    void clear() {
        cents = 0;
    }
    double total() {
        return cents / 100.0;
    }
}
/*

1. Show total
2. Add penny
3. Add nickel
4. Add dime
5. Add quarter
6. Empty bank
0. Quit
Enter choice: 5

1. Show total
2. Add penny
3. Add nickel
4. Add dime
5. Add quarter
6. Empty bank
0. Quit
Enter choice: 4

1. Show total
2. Add penny
3. Add nickel
4. Add dime
5. Add quarter
6. Empty bank
0. Quit
Enter choice: 1
Total: $0.35
*/