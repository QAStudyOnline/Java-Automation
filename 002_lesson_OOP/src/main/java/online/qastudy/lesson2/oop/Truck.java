package online.qastudy.lesson2.oop;

import online.qastudy.lesson2.oop.spares.TruckWheel;

public class Truck extends Car {
    private double loadСapacity;
    private int wheelsQuantity;

    public Truck() {
        super();
    }

    public Truck(String mode, String color, double loadСapacity, int wheelsQuantity) {
        super(mode, color);
        this.loadСapacity = loadСapacity;
        this.wheelsQuantity = wheelsQuantity;

    }

    public double getLoadСapacity() {
        return loadСapacity;
    }

    public void setLoadСapacity(double loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    public TruckWheel[] chassis() {
        TruckWheel[] chassis = new TruckWheel[wheelsQuantity];
        for (int i = 0; i < chassis.length; i++) {
            chassis[i] = new TruckWheel();
        }
        return chassis;
    }

    public String getInfo() {
        StringBuilder info = new StringBuilder()
                .append("[\n")
                .append(" Model: ").append(getModel())
                .append("\n")
                .append(" Color: ").append(getColor())
                .append("\n")
                .append(" Load Capacity: ").append(this.loadСapacity)
                .append("\n")
                .append(" Wheels Quantity: ").append(this.wheelsQuantity)
                .append("\n");

        for (int i = 0; i < chassis().length; i++) {
            info.append(" - Pressure in wheel " + (i + 1) + ":")
                    .append(chassis()[i].getPressure())
                    .append("\n");
        }

        info.append("]");

        return info.toString();
    }

    @Override
    public String toString() {
        return "Пора в отпуск!!";
    }
}
