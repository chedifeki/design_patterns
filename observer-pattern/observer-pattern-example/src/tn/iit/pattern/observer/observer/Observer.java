package tn.iit.pattern.observer.observer;

public interface Observer {
    void update(int temperature, int pressure, int humidity);
    void display();
}
