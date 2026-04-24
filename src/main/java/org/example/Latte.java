package org.example;

public class Latte extends Beverage {
    private int shots;

    public Latte(String temperature, String size, String milk, String sweetener, int shots) {
        this.temperature = temperature;
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
        this.shots = shots;
    }

    @Override
    public String toString() {
        return temperature + " Latte" + super.toString() + " | Shots: " + shots;
    }
}
