package ch6_oop.src.oop;

public class SingletonEx {
    public static void main(String[] args) {
        // Singleton singleton = new Si

        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2 ? "같은 객체" : "다른 객체");

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1 == student2 ? "같은 객체" : "다른 객체");

    }
}
