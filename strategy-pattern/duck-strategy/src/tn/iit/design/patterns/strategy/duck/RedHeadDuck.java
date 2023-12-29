package tn.iit.design.patterns.strategy.duck;

import tn.iit.design.patterns.strategy.behavior.FlyWithWings;
import tn.iit.design.patterns.strategy.behavior.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void swim() {
        System.out.println("Red head is Swimming!");
    }

    @Override
    public void display() {
        System.out.println("This is a redhead duck!" );
    }
}
