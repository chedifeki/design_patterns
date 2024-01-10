package tn.iit.pattern.strategy.duck;

import tn.iit.pattern.strategy.behavior.FlyBehavior;
import tn.iit.pattern.strategy.behavior.QuackBehavior;

public  abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public  void swim(){
        System.out.println("This Duck is swimming !");
    }
    public  abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
