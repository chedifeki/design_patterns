package tn.iit.pattern.observer.chrono;

import tn.iit.pattern.observer.alarm.SonnerieObserver;
import tn.iit.pattern.observer.clock.DisplayObserver;

public abstract class AbstractChrono {

    protected int seconde;
    protected int minute;
    protected int heure;

    public int getSeconde() {
        return seconde;
    }

    public int getMinute() {
        return minute;
    }

    public int getHeure() {
        return heure;
    }

    public void tick(int seconde, int minute, int heure) {
        this.seconde = seconde;
        this.minute = minute;
        this.heure = heure;

        notifyDisplayObservers();

        if (seconde == 0 && minute == 0)
            notifySonnerieObservers();
    }


    public abstract void registerDisplayObserver(DisplayObserver observer);
    public abstract void removeDisplayObserver(DisplayObserver observer);
    public abstract void notifyDisplayObservers();

    public abstract void registerSonnerieObserver(SonnerieObserver observer);
    public abstract void removeSonnerieObserver(SonnerieObserver observer);
    public abstract void notifySonnerieObservers();
}
