package online.qastudy.lesson2.bonus.basequestion;

public class Main {
    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = 10;

        System.out.println("Integer a == Integer b :");
        System.out.println(a == b);

        System.out.println("Integer a equals Integer b :");
        System.out.println(a.equals(b));


        Integer a1 = 20;
        Integer a2 = 20;
        System.out.println("Integer a1 == Integer a2 :");
        System.out.println(a1 == a2);

        Integer b1 = 127;
        Integer b2 = 127;
        System.out.println("Integer b1 == Integer b2 :");
        System.out.println(b1 == b2);

        System.out.println("\n");

        String str1 = new String("Hello world!");
        String str2 = "Hello world!";

        System.out.println("String str1 == String str2 : ");
        System.out.println(str1 == str2);

        System.out.println("String str1 equals String str2 : ");
        System.out.println(str1.equals(str2));

        System.out.println("How much object will be create : ");
        String x = "Hello" + " world!";
        System.out.println(x);

        System.out.println("Will fix by StringBuilder : ");

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        sb.append("!");
        System.out.println(sb);

    }
}
