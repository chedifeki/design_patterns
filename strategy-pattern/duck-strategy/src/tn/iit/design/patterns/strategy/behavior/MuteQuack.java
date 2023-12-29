package tn.iit.design.patterns.strategy.behavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" --- (mute)" );
    }
}
