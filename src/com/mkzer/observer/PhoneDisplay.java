package com.mkzer.observer;

public class PhoneDisplay implements Observer {
    private String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " a reçu la météo : " + weather);
    }
}
