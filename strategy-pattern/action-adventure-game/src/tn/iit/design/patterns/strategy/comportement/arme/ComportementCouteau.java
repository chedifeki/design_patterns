package tn.iit.design.patterns.strategy.comportement.arme;

public class ComportementCouteau implements ComportementArme{

    @Override
    public void utiliseArme() {
        System.out.println("Couteau!");
    }
}
