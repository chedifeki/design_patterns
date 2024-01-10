package tn.iit.pattern.observer.clock;

import tn.iit.pattern.observer.chrono.AbstractChrono;

public class DisplayNumerique implements DisplayObserver {
    private AbstractChrono chrono;
    public DisplayNumerique(AbstractChrono chrono) {
        this.chrono = chrono;
    }

    @Override
    public void afficheTempsEcoule() {
        System.out.println("Display aiguille");
        System.out.println(chrono.getHeure() + ":" + chrono.getMinute() + ":" + chrono.getSeconde());
    }
}
