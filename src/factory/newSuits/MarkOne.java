package factory.newSuits;

import factory.IronManSuit;

/**
 * Custom suit for Ironman.
 */
public class MarkOne extends IronManSuit {

    public MarkOne() {
        suitName = "Mark I";
    }

    @Override
    public IronManSuit createSuit() {
        return new MarkOne();
    }
}
