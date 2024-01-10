package tn.iit.pattern.strategy.individu;

import tn.iit.pattern.strategy.comportement.arme.ComportementCouteau;

public class Reine extends Individu{
    public Reine() {
        setArme(new ComportementCouteau());
    }

    @Override
    public void display() {
        System.out.println("Je suis la reine!");
    }
}
