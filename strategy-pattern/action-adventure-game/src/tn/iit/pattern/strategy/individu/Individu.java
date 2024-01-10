package tn.iit.pattern.strategy.individu;

import tn.iit.pattern.strategy.comportement.arme.ComportementArme;

public abstract class Individu {
    protected ComportementArme arme ;

    public  void combattre(){
        arme.utiliseArme();
    };
    public abstract void display();

    public void setArme(ComportementArme ca){
        this.arme = ca;
    }
}
