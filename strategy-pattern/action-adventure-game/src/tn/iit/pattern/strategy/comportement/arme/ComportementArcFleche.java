package tn.iit.pattern.strategy.comportement.arme;

public class ComportementArcFleche implements ComportementArme{
    @Override
    public void utiliseArme() {
        System.out.println("Arc à flèche");
    }
}
