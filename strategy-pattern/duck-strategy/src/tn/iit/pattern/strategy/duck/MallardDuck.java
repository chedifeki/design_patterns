package tn.iit.pattern.strategy.duck;

import tn.iit.pattern.strategy.behavior.FlyWithWings;
import tn.iit.pattern.strategy.behavior.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is a mallard duck!");
    }
}
