package tn.iit.design.patterns.strategy.duck;

import tn.iit.design.patterns.strategy.behavior.FlyNoWay;
import tn.iit.design.patterns.strategy.behavior.MuteQuack;

public class WoodenDuck extends Duck{
    public WoodenDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }



    @Override
    public void display() {
        System.out.println("This is a wooden duck!");
    }
}
