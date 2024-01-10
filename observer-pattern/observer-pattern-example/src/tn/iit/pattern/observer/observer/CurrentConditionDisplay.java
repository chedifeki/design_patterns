package tn.iit.pattern.observer.observer;

public class CurrentConditionDisplay implements Observer{
    @Override
    public void update(int temperature, int pressure, int humidity) {
        System.out.println("----------------");
        display();
        System.out.print("temperature = " + temperature);
        System.out.print("\tpressure = " + pressure);
        System.out.println("\thumidity = " + humidity);
        System.out.println("----------------");

    }

    @Override
    public void display() {
        System.out.println("Current Condition Display");
    }
}
