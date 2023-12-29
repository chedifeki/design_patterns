package tn.iit.design.patterns.strategy.behavior;

public class Squack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("SQUACK!");
    }
}
