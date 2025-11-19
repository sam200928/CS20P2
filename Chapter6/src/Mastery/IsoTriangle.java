package Mastery;

import java.util.Scanner;
public class IsoTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = input.nextInt();
        drawtriangle(size);
        input.close();
    }
    private static void drawtriangle(int size) {
        for (int line = 1; line <= size; line++) {
            addspaces(size - line);
            drawbar(line * 2 - 1);
            System.out.println();
        }
    }
    private static void drawbar(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    private static void addspaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
/*
Enter the size 5
    *
   ***
  *****
 *******
********* 
 */


