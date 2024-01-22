package tn.iit.pattern.decorator.condiments;

import tn.iit.pattern.decorator.beverages.Beverage;

public class Milk extends CondimentDecorator{
    public Milk( Beverage beverage) {
        super("Milk", 0.2f, beverage);
    }
}
