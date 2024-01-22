package tn.iit.pattern.decorator.condiments;

import tn.iit.pattern.decorator.beverages.Beverage;

public class Pine extends CondimentDecorator{
    public Pine( Beverage beverage) {
        super("Pine", 3.5f, beverage);
    }
}
