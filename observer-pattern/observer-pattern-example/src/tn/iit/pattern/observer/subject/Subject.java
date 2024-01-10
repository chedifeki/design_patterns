package tn.iit.pattern.observer.subject;

import tn.iit.pattern.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
