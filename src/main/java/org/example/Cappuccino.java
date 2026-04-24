package org.example;

public class Cappuccino extends Beverage {
    private int shots;

    public Cappuccino(String size, String milk, String sweetener, int shots) {
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
        this.shots = shots;
    }

    @Override
    public String toString() {
        return "Cappuccino" + super.toString() + " | Shots: " + shots;
    }
}
