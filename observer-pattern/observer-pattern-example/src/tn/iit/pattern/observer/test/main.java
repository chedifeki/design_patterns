package tn.iit.pattern.observer.test;

import tn.iit.pattern.observer.observer.CurrentConditionDisplay;
import tn.iit.pattern.observer.observer.ForecastDisplay;
import tn.iit.pattern.observer.observer.Observer;
import tn.iit.pattern.observer.observer.StatisticsDisplay;
import tn.iit.pattern.observer.subject.WeatherData;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        var weatherData = new WeatherData();
        weatherData.measurementChanged(15,2020,40);

        var observers = new ArrayList<Observer>();
        var ccd = new CurrentConditionDisplay();
        observers.add(ccd);
        observers.add(new ForecastDisplay());
        observers.add(new StatisticsDisplay());

        observers.forEach(observer -> {
            observer.display();
            weatherData.registerObserver(observer);
        });

        weatherData.measurementChanged(15,2015,75);
        System.out.println("========= removed CCD ==========" );
        weatherData.removeObserver(ccd);
        weatherData.measurementChanged(25, 2025,45);

    }
}
