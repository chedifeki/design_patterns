package tn.iit.pattern.strategy.duck;

import tn.iit.pattern.strategy.behavior.FlyWithWings;
import tn.iit.pattern.strategy.behavior.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is a redhead duck!" );
    }
}
