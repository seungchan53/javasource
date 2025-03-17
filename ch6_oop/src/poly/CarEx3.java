package ch6_oop.src.poly;

public class CarEx3 {
    public static void main(String[] args) {

        HankookTire frontLeft = new HankookTire(1, "앞 왼쪽");
        HankookTire frontRight = new HankookTire(1, "앞 오른쪽");
        HankookTire backLeft = new HankookTire(1, "뒤 왼쪽");
        HankookTire backRight = new HankookTire(1, "뒤 오른쪽");

        Car3 car3 = new Car3(frontLeft, frontRight, backLeft, backRight);

        car3 = new Car3(new HankookTire(1, "앞 왼쪽"), frontRight,
                new HankookTire(1, "뒤 왼쪽"), backLeft);

        System.out.println(car3.frontLeft); // null
        System.out.println(car3.num); // 0
        // NullPointerException
        System.out.println(car3.frontLeft.accumulateRotaton);
    }
}
