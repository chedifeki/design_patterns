package tn.iit.design.patterns.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly rocket powered !");
    }
}
