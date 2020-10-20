package online.qastudy.lesson1;

public class LessonOneVars {
    // Первый Урок и пример однострочного комментария

    /*
     * Примитивные типы данных имеют фиксированный размер:
     *    Тип Размер Описание .
     *    byte 1 байт Целые (-128;127)
     *    char 2 байта Натуральные (0;65535)
     *    int 4 байта Целые (-2147483648; 2147483647)
     *    long 8 байт Целые (-128;127)
     *    double 8 байта Вещественное
     *    float 4 байта Вещественное
     *    boolean– зависит от платформы и особенностей, зачастую 1 байт, значение true или false
     *    String – Объектное представление строки
     *
     *    Ну и если что то это многострочный комментарий
     *
     * */

    /**
     * Пример Java Doc
     * Их пишем кодгда нужно делать документацию о работе кода.
     * После команды " javadoc -d doc 001_lesson/src/main/java/online/qastudy/lesson1/* " они будут сгенерированы, в папке doc.
     *
     * @param args
     * @return
     */

    public static void main(String[] args) {
        byte variableByte;
        variableByte = 0101;
        char variableChar = 'v';
        char variableCharAsNumber = 118;
        int variableInt = 1;
        long variableLong = 2;
        double variableDoubel = 2.5; // Класическая ошибка использовать double для работы с деньгами. Лучше брать класс BigDecimal
        float variableFloat = 2.5f;
        boolean variableBoolean = true;
        String variableString = "automation testing is awesome!";

        System.out.println("Byte var is: " + variableByte);
        System.out.println("Char var is: " + variableChar);
        System.out.println("Char var as a code is: " + variableCharAsNumber);
        System.out.println("Int var is: " + variableInt);
        System.out.println("Long var is: " + variableLong);
        System.out.println("Double var is: " + variableDoubel);
        System.out.println("Float var is: " + variableFloat);
        System.out.println("Boolean var is: " + variableBoolean);
        System.out.println("String var is: " + variableString);

    }
}
