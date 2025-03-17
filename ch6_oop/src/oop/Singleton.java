package ch6_oop.src.oop;

public class Singleton {

    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
