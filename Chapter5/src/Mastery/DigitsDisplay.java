package Mastery;

import java.util.Scanner;
public class DigitsDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int digits = input.nextInt();
        String stringDigits = Integer.toString(digits);
        for (int i = 0; i < stringDigits.length(); i++) {
        System.out.println(stringDigits.charAt(i));
        input.close();
        }
    }
}
