package online.qastudy.lesson2.oop;

import online.qastudy.lesson2.LessonTwoMethods;
import online.qastudy.lesson2.oop.spares.BaseWheel;
import online.qastudy.lesson2.oop.spares.TruckWheel;

public class Main {
    public static void main(String[] args) {
//        Car accent = new Car("Hyundai","blue");
//        accent.setTransmission(5);
//        Car gelandewagen = new Car("Mercedes", "back");
//        gelandewagen.setTransmission(7);
//
//        System.out.println(accent);
//        System.out.println(gelandewagen.toString());
//        Car lanos = new Car();
//        lanos.setTransmission(4);

        Truck kamaz = new Truck();
        System.out.println(kamaz);

        Truck belaz = new Truck("Билаз","Красный", 4.5,8);
        System.out.println(belaz);

        System.out.println(belaz.getInfo());


        System.out.println(LessonTwoMethods.AGE);
    }
}
