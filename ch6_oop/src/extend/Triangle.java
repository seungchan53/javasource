package ch6_oop.src.extend;

public class Triangle extends Shape {
    Point[] point;

    public Triangle(Point[] point1) {
        this.point = point;
    }

    void draw() {
        System.out.printf("[p1 = %s p2 = %s p3 = %s, color = %s]\n",
                point[0].GetXY(), point[1].GetXY(), point[2].GetXY(), color);
    }
}
