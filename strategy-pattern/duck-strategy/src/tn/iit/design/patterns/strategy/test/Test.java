package tn.iit.design.patterns.strategy.test;

import tn.iit.design.patterns.strategy.behavior.FlyRocketPowered;
import tn.iit.design.patterns.strategy.duck.*;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedHeadDuck());
        ducks.add(new WoodenDuck());
        ducks.add(new RubberDuck());

        ducks.forEach(duck -> {
            duck.display();
            duck.swim();
            duck.performQuack();
            duck.performFly();
            if (duck instanceof MallardDuck){

                System.out.println("Elloumi Jump");
                duck.setFlyBehavior(new FlyRocketPowered());
                duck.performFly();
            }
            System.out.println("------------");
        });

    }
}

