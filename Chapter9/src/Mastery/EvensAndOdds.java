package Mastery;
import java.util.Random;
public class EvensAndOdds {
    public static void main(String[] args) {
        int[] numbers = generateNumbers(25, 0, 99);
        printOdds(numbers);
        printEvens(numbers);
    }
    private static int[] generateNumbers(int count, int min, int max) {
        Random random = new Random();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = random.nextInt(max - min + 1) + min;
        }
        return nums;
    }
    private static void printOdds(int[] numbers) {
        System.out.println("Odd");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    private static void printEvens(int[] numbers) {
        System.out.println("Even");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}


/*
Odd
35 35 85 69 71 49 79 83 67 23 67 9 95 21 87 
Even
42 98 54 84 12 50 98 88 6 62 
*/