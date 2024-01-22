package tn.iit.pattern.decorator.condiments;

import tn.iit.pattern.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    protected CondimentDecorator(final String description, final float price,  final Beverage beverage) {
        super(description, price);
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " \n\t+ " + description +"\t" +price;
    }

    @Override
    public float cost() {
        return price + beverage.cost();
    }
}
