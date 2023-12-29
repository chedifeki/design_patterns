package tn.iit.design.patterns.strategy.individu;

import tn.iit.design.patterns.strategy.comportement.arme.ComportementArcFleche;
import tn.iit.design.patterns.strategy.comportement.arme.ComportementCouteau;

public class Archer extends Individu{
    private int ammunition;

    public Archer(int ammunition) {
        this.ammunition = ammunition;
        setArme(new ComportementArcFleche());
    }

    @Override
    public void combattre() {
        super.combattre();
        if (ammunition > 0) {
            ammunition--;
            checkAmmo();
        }
    }

    private void checkAmmo() {
        if (ammunition == 0) {
            System.out.println("Plus de flèches! j'utilise un couteau");
            setArme(new ComportementCouteau());
        }
    }


    @Override
    public void display() {
        System.out.println("Je suis un archer!");

    }
}
