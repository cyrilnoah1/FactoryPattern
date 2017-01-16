package factory.newSuits;

import factory.IronManSuit;

/**
 * Custom suit for Ironman.
 */
public class IronMonger extends IronManSuit {

    public IronMonger() {
        suitName = "Iron Monger";
    }

    @Override
    public IronManSuit createSuit() {
        return new IronMonger();
    }
}
