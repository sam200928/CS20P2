package Mastery;

import java.util.Scanner;
import java.util.Random;
public class classStone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stonepiles piles = new Stonepiles();
        startGame(input, piles);
    }
    private static void startGame(Scanner input, Stonepiles piles) {
        System.out.println("Take 1, 2, or 3 stones.");
        System.out.println("The player that takes the last stone losses.");
        System.out.println("There are " + piles.getStonesLeft() + " stones in the piles.\n");
        while (piles.getStonesLeft() > 0) {
            playerTurn(input, piles);
            if (piles.getStonesLeft() == 0) {
                System.out.println("You lost, play better next time");
                break;
            }
            computerTurn(piles);
            if (piles.getStonesLeft() == 0) {
                System.out.println("Computer messed up, you got lucky.");
                break;
            }
        }
    }
    private static void playerTurn(Scanner input, Stonepiles piles) {
        int stonesgrabbed;
        do {
            System.out.print("Your turn. How many stones will you take (1-3)? ");
            stonesgrabbed = input.nextInt();
        } while (!piles.isValidMove(stonesgrabbed));

        piles.removeStones(stonesgrabbed);
        System.out.println("Stones left: " + piles.getStonesLeft());
    }
    private static void computerTurn(Stonepiles piles) {
        int stonesgrabbed = piles.computerMove();
        System.out.println("Computer takes " + stonesgrabbed + " stone" + (stonesgrabbed > 1 ? "s" : "") + ".");
        piles.removeStones(stonesgrabbed);
        System.out.println("Stones left: " + piles.getStonesLeft() + "\n");
    }
}
class Stonepiles {
    private int stones;
    private Random randomizer;
    public Stonepiles() {
        randomizer = new Random();
        stones = randomizer.nextInt(16) + 15; 
    }
    public int getStonesLeft() {
        return stones;
    }
    public boolean isValidMove(int stonesgrabbed) {
        return stonesgrabbed >= 1 && stonesgrabbed <= 3 && stonesgrabbed <= stones;
    }
    public void removeStones(int stonesgrabbed) {
        stones -= stonesgrabbed;
    }
    public int computerMove() {
        if (stones >= 3) {
            return randomizer.nextInt(3) + 1;
        } else {
            return randomizer.nextInt(stones) + 1;
        }
    }
}
/*
 Take 1, 2, or 3 stones.
The player that takes the last stone losses.
There are 26 stones in the piles.

Your turn. How many stones will you take (1-3)? 3
Stones left: 23
Computer takes 3 stones.
Stones left: 20

Your turn. How many stones will you take (1-3)? 3
Stones left: 17
Computer takes 2 stones.
Stones left: 15
*/
