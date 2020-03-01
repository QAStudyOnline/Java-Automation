package online.qastudy.lesson1.oop;

public enum Wheels {
    TRUCK_WHEEL(40,2.5, "one", "rosava"),
    CAR_WHEEL(16,2.2,"two", "nokia"),
    MOTORCYCLE_WHEEL(12,2.0,"half", "rosava");

    private int diameter;
    private double pressure;
    private String model;
    private String maker;

    Wheels(int diameter, double pressure, String model, String maker) {
        this.diameter = diameter;
        this.pressure = pressure;
        this.model = model;
        this.maker = maker;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
