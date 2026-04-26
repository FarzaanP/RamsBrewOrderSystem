package org.example;

public class OrderDriver {
    public static void main(String[] args) {

        Beverage latte = new BeverageImplementation()
                .setTemperature("Iced")
                .setSize("Large")
                .setMilk("Oat")
                .setShots(2)
                .setSweetener("Honey")
                .getLatte();
        Order order1 = new Order(latte, "Takeout");


        Beverage cappuccino = new BeverageImplementation()
                .setSize("Medium")
                .setMilk("Almond")
                .setShots(1)
                .setSweetener("Sugar")
                .getCappuccino();
        Order order2 = new Order(cappuccino, "Dine-in");

        Beverage tea = new BeverageImplementation()
                .setTemperature("Iced")
                .setSize("Small")
                .setSweetener("Stevia")
                .getTea();
        Order order3 = new Order(tea, "Takeout");

        Beverage coffee = new BeverageImplementation()
                .setTemperature("Hot")
                .setSize("Medium")
                .setMilk("Whole")
                .setSweetener("None")
                .getCoffee();
        Order order4 = new Order(coffee, "Dine-in");

        System.out.println("=== Ram's Brew Coffee Shop ===");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
    }
}
