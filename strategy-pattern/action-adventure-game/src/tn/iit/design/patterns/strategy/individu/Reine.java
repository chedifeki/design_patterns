package tn.iit.design.patterns.strategy.individu;

import tn.iit.design.patterns.strategy.comportement.arme.ComportementCouteau;

public class Reine extends Individu{
    public Reine() {
        setArme(new ComportementCouteau());
    }

    @Override
    public void display() {
        System.out.println("Je suis la reine!");
    }
}
