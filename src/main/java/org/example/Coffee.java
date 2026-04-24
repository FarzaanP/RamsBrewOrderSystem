package org.example;

public class Coffee extends Beverage {
    private String temperature;

    public Coffee(String temperature, String size, String milk, String sweetener) {
        this.temperature = temperature;
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
    }

    @Override
    public String toString() {
        return temperature + " Coffee" + super.toString();
    }
}
