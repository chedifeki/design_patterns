package tn.iit.pattern.observer.clock;

import tn.iit.pattern.observer.chrono.AbstractChrono;

public class DisplayAiguille implements DisplayObserver {
    private AbstractChrono chrono;
    public DisplayAiguille(AbstractChrono chrono) {
        this.chrono = chrono;
    }

    @Override
    public void afficheTempsEcoule() {
        System.out.println("Display Numerique");
        System.out.println(chrono.getHeure() + ":" + chrono.getMinute() + ":" + chrono.getSeconde());
    }
}
