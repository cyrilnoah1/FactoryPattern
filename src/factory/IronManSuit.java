package factory;

/**
 * Parent class for all the Ironman suits.
 */
public abstract class IronManSuit {
    public String suitName = "Unknown";

    public abstract IronManSuit createSuit();

    /**
     * Create and text a custom Ironman suit.
     */
    public void testSuit() {
        IronManSuit ironManSuit = createSuit();
        // Wearing the created suit.
        ironManSuit.wearTheSuit();
        // Flying the suit.
        ironManSuit.flyTheSuit();
    }

    /**
     * Wear the created Ironman suit.
     */
    public void wearTheSuit() {
        System.out.println("\nNew suit created.");
        System.out.println("You just wore the newly created " + suitName + " suit.");
    }

    /**
     * Fly the created Ironman suit.
     */
    public void flyTheSuit() {
        System.out.println("Now you're flying the " + suitName + " suit. Woosh!");
    }
}
