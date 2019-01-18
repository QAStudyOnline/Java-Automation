package online.qastudy.lesson2.bonus.innerclasses;

//http://www.onjava.com/pub/a/onjava/excerpt/HardcoreJava_chap06/index.html

class A {
    private void print() {
        System.out.println("I am print from class A");
    }

    public void callA() {
        System.out.println("You call class A");
    }

    private class B {
        private void print() {
            System.out.println("I am print from class B");
            A.this.print();
        }

        public void callB() {
            System.out.println("You call class B");
            callA();
        }
    }

    public void callB() {
        B b = new B();
        b.print();
        b.callB();
    }

    public class C {
        private void print() {
            System.out.println("I am print from class C");
            A.this.print();
        }

        public void callC() {
            System.out.println("You call class C");
            callA();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.callA();

        A.C c = a.new C();
        c.callC();

        a.callB();
    }


}
