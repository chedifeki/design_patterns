package tn.iit.pattern.decorator.condiments;

import tn.iit.pattern.decorator.beverages.Beverage;
import tn.iit.pattern.decorator.beverages.Coffee;

public class Mint extends CondimentDecorator{
    public Mint( Beverage beverage) {
        super("Mint", 0.3f, beverage);
        if (hasCoffe(beverage))
            throw new RuntimeException("Combinaison impossible");
    }

    private boolean hasCoffe(Beverage beverage) {
        while (beverage instanceof CondimentDecorator){
            beverage =  ((CondimentDecorator) beverage).beverage;
        }
        return beverage instanceof Coffee;
    }
}
