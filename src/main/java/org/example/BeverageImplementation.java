package org.example;

public class BeverageImplementation implements BeverageBuilder {

    private String size;
    private String milk;
    private String sweetener;
    private String temperature;
    private int shots;

    @Override
    public BeverageBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public BeverageBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    @Override
    public BeverageBuilder setShots(int shots) {
        this.shots = shots;
        return this;
    }

    @Override
    public BeverageBuilder setSweetener(String sweetener) {
        this.sweetener = sweetener;
        return this;
    }

    @Override
    public BeverageBuilder setTemperature(String temperature) {
        this.temperature = temperature;
        return this;
    }

    @Override
    public Coffee getCoffee() {
        return new Coffee(temperature, size, milk, sweetener);
    }

    @Override
    public Latte getLatte() {
        return new Latte(temperature, size, milk, sweetener, shots);
    }

    @Override
    public Cappuccino getCappuccino() {
        return new Cappuccino(size, milk, sweetener, shots);
    }

    @Override
    public Tea getTea() {
        return new Tea(temperature, size, milk, sweetener);
    }
}
