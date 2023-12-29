package tn.iit.design.patterns.strategy.duck;

import tn.iit.design.patterns.strategy.behavior.FlyNoWay;
import tn.iit.design.patterns.strategy.behavior.Squack;

public class RubberDuck extends Duck{
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squack();
    }


    @Override
    public void display() {
        System.out.println("this is a rubber duck!");
    }
}
