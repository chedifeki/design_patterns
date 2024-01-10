package tn.iit.pattern.observer.subject;

import tn.iit.pattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private int temperature;
    private int pressure;
    private int humidity;

    private List<Observer> observers = new ArrayList<>();

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void measurementChanged(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
    observers.forEach(observer -> observer.update(temperature, pressure,humidity));
    }
}
