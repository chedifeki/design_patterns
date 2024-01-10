package tn.iit.pattern.observer.chrono;

import tn.iit.pattern.observer.alarm.SonnerieObserver;
import tn.iit.pattern.observer.clock.DisplayAiguille;
import tn.iit.pattern.observer.clock.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class Chrono extends AbstractChrono {

    private List<DisplayObserver> displayObservers = new ArrayList<>();
    private List<SonnerieObserver> sonnerieObservers = new ArrayList<>();

    @Override
    public void registerDisplayObserver(DisplayObserver observer) {
        displayObservers.add(observer);

    }

    @Override
    public void removeDisplayObserver(DisplayObserver observer) {
        displayObservers.remove(observer);
    }

    @Override
    public void notifyDisplayObservers() {
        displayObservers.forEach(DisplayObserver::afficheTempsEcoule);

    }

    @Override
    public void registerSonnerieObserver(SonnerieObserver observer) {
        sonnerieObservers.add(observer);
    }

    @Override
    public void removeSonnerieObserver(SonnerieObserver observer) {
        sonnerieObservers.remove(observer);
    }

    @Override
    public void notifySonnerieObservers() {
sonnerieObservers.forEach(SonnerieObserver::ding);
    }
}
