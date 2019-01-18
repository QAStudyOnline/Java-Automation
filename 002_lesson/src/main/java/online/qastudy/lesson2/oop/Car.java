package online.qastudy.lesson2.oop;

public class Car {
    private String model;
    private String color;
    private int transmissionNumber;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Car() {
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setTransmission(int transmission) {
        this.transmissionNumber = transmission;
    }

    public String toString() {
        return "Это автомобиль марки " +
                this.model + ", " +
                this.color + " цвет, " +
                this.transmissionNumber + " передач";
    }
}
