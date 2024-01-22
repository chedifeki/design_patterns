package tn.iit.pattern.decorator.condiments;

import tn.iit.pattern.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super("Whip Cream", 0.1f, beverage);
    }
}
