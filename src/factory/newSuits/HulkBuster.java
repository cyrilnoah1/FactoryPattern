package factory.newSuits;

import factory.IronManSuit;

/**
 * Custom suit for Ironman.
 */
public class HulkBuster extends IronManSuit {

    public HulkBuster() {
        suitName = "Hulk buster";
    }

    @Override
    public IronManSuit createSuit() {
        return new HulkBuster();
    }
}
