package tn.iit.design.patterns.strategy.individu;

import tn.iit.design.patterns.strategy.comportement.arme.ComportementArme;

public abstract class Individu {
    ComportementArme arme ;

    public  void combattre(){
        arme.utiliseArme();
    };
    public abstract void display();

    public void setArme(ComportementArme ca){
        this.arme = ca;
    }
}
