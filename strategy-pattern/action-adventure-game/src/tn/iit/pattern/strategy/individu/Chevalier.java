package tn.iit.pattern.strategy.individu;

import tn.iit.pattern.strategy.comportement.arme.ComportementEpee;

public class Chevalier extends Individu{
    public Chevalier() {
        setArme(new ComportementEpee());
    }

    @Override
    public void display() {
        System.out.println("Je suis un chevalier!");
    }
}
