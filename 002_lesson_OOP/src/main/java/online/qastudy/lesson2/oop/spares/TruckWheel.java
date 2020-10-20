package online.qastudy.lesson2.oop.spares;

public class TruckWheel extends BaseWheel {

    public int changeSize() {
        return 5;
    }

    @Override
    public double getPressure() {
        return 4.3;
    }
}
