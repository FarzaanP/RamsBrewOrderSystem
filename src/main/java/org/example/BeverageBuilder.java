package org.example;

public interface BeverageBuilder {
    BeverageBuilder setSize(String size);
    BeverageBuilder setMilk(String milk);
    BeverageBuilder setShots(int shots);
    BeverageBuilder setSweetener(String sweetener);
    BeverageBuilder setTemperature(String temperature);
    Coffee getCoffee();
    Latte getLatte();
    Cappuccino getCappuccino();
    Tea getTea();
}
