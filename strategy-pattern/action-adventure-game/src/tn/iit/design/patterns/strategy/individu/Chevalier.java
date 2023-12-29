package tn.iit.design.patterns.strategy.individu;

import tn.iit.design.patterns.strategy.comportement.arme.ComportementEpee;

public class Chevalier extends Individu{
    public Chevalier() {
        setArme(new ComportementEpee());
    }

    @Override
    public void display() {
        System.out.println("Je suis un chevalier!");
    }
}
