package online.qastudy.lesson2.oop.spares;

public abstract class BaseWheel {
    public static final String SHAPE = "circle";
    public abstract int changeSize();

    public double getPressure() {
        return 2.2;
    }

    public void printWheel(){
        System.out.println("  -");
        System.out.println("/  \\");
        System.out.println("\\  /");
        System.out.println("  -  ");
    }
}
