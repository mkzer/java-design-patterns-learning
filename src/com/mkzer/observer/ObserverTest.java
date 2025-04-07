package com.mkzer.observer;

public class ObserverTest {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone1 = new PhoneDisplay("Téléphone 1");
        Observer phone2 = new PhoneDisplay("Téléphone 2");

        station.registerObserver(phone1);
        station.registerObserver(phone2);

        station.setWeather("☀️ Ensoleillé");
        station.setWeather("🌧️ Pluie");
    }
}
