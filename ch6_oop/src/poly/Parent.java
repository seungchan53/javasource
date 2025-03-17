package ch6_oop.src.poly;

import javax.print.DocFlavor.STRING;

public class Parent {
    String field1;

    public void method1() {
        System.out.println("parent method1()");
    }

    public void method2() {
        System.out.println("parent method2()");
    }
}

class Child extends Parent {
    String field2;

    @Override
    public void method2() {
        System.out.println("Chile method2()");
    }

    public void method3() {
        System.out.println("Child method3()");
    }

}
