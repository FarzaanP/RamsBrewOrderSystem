package org.example;

public class Tea extends Beverage{

    public Tea(String temperature, String size, String milk, String sweetener) {
        this.temperature = temperature;
        this.size = size;
        this.milk = milk;
        this.sweetener = sweetener;
    }

    @Override
    public String toString() {
        return temperature + " Tea" + super.toString();
    }
}
