package tn.iit.design.patterns.strategy.comportement.arme;

public class ComportementEpee implements ComportementArme{
    @Override
    public void utiliseArme() {
        System.out.println("Epee");
    }
}
