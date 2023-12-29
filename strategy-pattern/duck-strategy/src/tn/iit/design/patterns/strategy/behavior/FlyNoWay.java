package tn.iit.design.patterns.strategy.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Fly No Way!");
    }
}
