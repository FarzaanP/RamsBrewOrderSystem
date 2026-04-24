package org.example;

public abstract class Beverage {

    protected String size;
    protected String milk;
    protected String sweetener;
    protected String temperature;

    @Override
    public String toString() {
        return " | Size: " + size +
                (temperature != null ? " | Temp: " + temperature : "") +
                (milk != null ? " | Milk: " + milk : "") +
                (sweetener != null ? " | Sweetener: " + sweetener : "");
    }
}
