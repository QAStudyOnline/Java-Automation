package online.qastudy.lesson2.oop.spares;


public class UnitT {
    private String manufacturer;
    private double price;

    // Конструктор класса Phone
    public UnitT(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Метод для получения производителя телефона
    public String getManufacturer() {
        return manufacturer;
    }

    // Метод для получения стоимости телефона
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        // Создаем объект класса Phone
        UnitT phone = new UnitT("Samsung", 799.89);

        // Получаем и выводим информацию о производителе и стоимости телефона
        String manufacturer = phone.getManufacturer();
        double price = phone.getPrice();

        System.out.println("Made by: " + manufacturer);
        System.out.println("Price: $" + price);
    }
}
