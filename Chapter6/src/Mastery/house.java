package Mastery;

public class house {

    public static void main(String[] args) {
        addRoof();
        addBase();
        addWalk();
    }
    private static void addRoof() {
        System.out.println("   ()");
        System.out.println("  (  )");
        System.out.println(" (____)");
    }
    private static void addBase() {
        System.out.println(" |    |");
        System.out.println(" |    |");
        System.out.println(" |____|");
    }
    private static void addWalk() {
        System.out.println("   **");
        System.out.println(" ************");
    }
}
/*
 ()
(  )
(____)
|    |
|    |
|____|
  **
************
*/