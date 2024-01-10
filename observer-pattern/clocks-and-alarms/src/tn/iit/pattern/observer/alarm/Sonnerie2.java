package tn.iit.pattern.observer.alarm;

import tn.iit.pattern.observer.chrono.AbstractChrono;

public class Sonnerie2 implements SonnerieObserver {

    private AbstractChrono chrono;
    public Sonnerie2(AbstractChrono chrono) {
        this.chrono = chrono;
    }

    @Override
    public void ding() {
        for (int i = 0; i < chrono.getHeure(); i++)
            System.out.println("Sonnerie 2 Ding!");
    }
}
