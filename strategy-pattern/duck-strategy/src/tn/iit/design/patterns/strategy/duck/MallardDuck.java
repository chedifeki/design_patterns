package tn.iit.design.patterns.strategy.duck;

import tn.iit.design.patterns.strategy.behavior.FlyWithWings;
import tn.iit.design.patterns.strategy.behavior.Quack;

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
