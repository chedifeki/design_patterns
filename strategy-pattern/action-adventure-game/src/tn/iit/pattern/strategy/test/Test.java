package tn.iit.pattern.strategy.test;

import tn.iit.pattern.strategy.individu.Archer;
import tn.iit.pattern.strategy.individu.Chevalier;
import tn.iit.pattern.strategy.individu.Individu;
import tn.iit.pattern.strategy.individu.Reine;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Individu> individus = new ArrayList<>();
        individus.add(new Reine());
        individus.add(new Chevalier());
        individus.add(new Archer(5));

        individus.forEach(i -> {
            i.display();
            for (int j = 0 ; j<6 ; j++){
                i.combattre();
            }
            System.out.println("-------------");
        });

    }
}
