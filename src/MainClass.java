import factory.IronManSuit;
import factory.newSuits.HulkBuster;
import factory.newSuits.IronMonger;
import factory.newSuits.MarkOne;
import factory.newSuits.MarkThree;

import java.util.Scanner;

/**
 * Class containing main method.
 */
public class MainClass {
    private static Scanner scan = new Scanner(System.in);

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String[] args) {
        // Testing custom Ironman suit.
        testAnIronmanSuit();
    }

    /**
     * Creating and testing an Ironman suit, by user's choice.
     */
    private static void testAnIronmanSuit() {
        // Asking user to choose a custom Ironman suit.
        System.out.println("Enter an Ironman suit that you'd like to test:");
        System.out.println("1) Mark I");
        System.out.println("2) Mark III");
        System.out.println("3) Iron Monger");
        System.out.println("4) Hulk Buster");
        System.out.print("Enter choice : ");

        switch (scan.nextInt()) {
            // Mark I.
            case 1:
                IronManSuit markOne = new MarkOne();
                markOne.testSuit();
                break;
            // Mark III.
            case 2:
                IronManSuit markThree = new MarkThree();
                markThree.testSuit();
                break;
            // Iron Monger.
            case 3:
                IronManSuit ironMonger = new IronMonger();
                ironMonger.testSuit();
                break;
            // Hulk Buster.
            case 4:
                IronManSuit hulkBuster = new HulkBuster();
                hulkBuster.testSuit();
                break;

            default:
                System.out.println("Invalid input. Please choose again...\n\n");
                testAnIronmanSuit();
                break;
        }
    }
}
