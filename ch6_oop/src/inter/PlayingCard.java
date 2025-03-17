package ch6_oop.src.inter;

public interface PlayingCard {

    // 멤버변수 가질수 없음
    // boolean pause;

    // 상수(대문자로 선언)
    public static final int SPADE = 4;
    // public static final 생략 가능
    int CLOVER = 1;

    // 일반메서드 가질 수 없음
    // void pause() {}

    // public abstract 생략 가능
    void pause(); // 추상 메서드만 가질수 있음

    // static, default 가 붙는다면 일반메소드도
    static void display() {

    }

    default void print() {

    }
}
