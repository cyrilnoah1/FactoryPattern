package factory.newSuits;

import factory.IronManSuit;

/**
 * Custom suit for Ironman.
 */
public class MarkThree extends IronManSuit {

    public MarkThree() {
        suitName = "Mark III";
    }

    @Override
    public IronManSuit createSuit() {
        return new MarkThree();
    }
}
