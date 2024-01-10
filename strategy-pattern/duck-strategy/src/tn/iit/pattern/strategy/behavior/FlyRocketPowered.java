package tn.iit.pattern.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly rocket powered !");
    }
}
