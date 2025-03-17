package ch6_oop.src.extend;

// 클래스간의 관계
// 1) 상속관계 : isa
// 2) 포함 관계 : hasa
//    한 클래스 안에 다른 클래스가 멤버 변수로 선언

// 관계 결정하기
// public class Circle extends Point{}
// extends : 원(Circle)은 점(point)이다 : Circle is a Point
// 포함 : 원(circle)은 점(point)을 가지고 있다 : Circle has a Point

// Car,SportsCar
// SportsCar 는 Car이다 or  SportsCar는 Car를 가지고 있다

public class Circle {
    // int x;
    // int y;
    Point point;
    int r;

    public Circle() {
    }

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center = (%d,%d), r = %d, color = %s]\n",
                point.x, point.y, r);
    }
}
