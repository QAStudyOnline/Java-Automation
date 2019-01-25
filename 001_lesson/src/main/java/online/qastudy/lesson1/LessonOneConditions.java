package online.qastudy.lesson1;

public class LessonOneConditions {
    public static void main(String[] args) {
        String name = "Java";
        int age = 2019 - 1996;

//        String name = "Kotlin";
//        int age = 2019 - 2016;

//        String name = "Groovy";
//        int age = 2019 - 2003;

//        String name = "Scala";
//        int age = 2019 - 2005;
        // && - and
        // || - or
//        if (name.equals("Java") || age > 20) {
//            System.out.println(name + " best programming language with more then " + age + " years history...");
//        }
//
//        if (name.equals("Kotlin") && age >= 3) {
//            System.out.println(name + " best programming language with more then " + age + " years history...");
//        } else if (name.equals("Groovy") && age >= 16) {
//            System.out.println(name + " best programming language with more then " + age + " years history...");
//        } else {
//            System.out.println(name + " best programming language with more then " + age + " years history...");
//        }

//        switch (name) {
//            case "Groovy":
//                System.out.println("Power of groovy!!");
//                break;
//            case "Scala":
//                System.out.println("Power of Scala!!");
//                break;
//            case "Kotlin":
//                System.out.println("Power of Kotlin!!");
//                break;
//            default:
//                System.out.println("Java is number one!!");
//        }


        String resultOfTernaryOperator = name.equals("Java") && age > 20 ? "Java is cool!!" : "Ooops not a Java!!";
//        (conditions) ? (if true) : (if false);
        System.out.println(resultOfTernaryOperator);
    }
}
