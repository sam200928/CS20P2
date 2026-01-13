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
