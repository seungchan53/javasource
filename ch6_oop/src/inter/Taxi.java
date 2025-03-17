package ch6_oop.src.inter;

public class Taxi implements Vehicle {

    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
