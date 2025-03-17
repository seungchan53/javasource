package ch6_oop.src.poly;

public class Tire {
    int maxRotaion; // 최대 회전수
    int accumulateRotaton; // 누적 회전수
    String location; // 타이어 위치

    public Tire(int maxRotaion, String location) {
        this.maxRotaion = maxRotaion;
        this.location = location;
    }

    public boolean roll() {
        ++accumulateRotaton;

        if (accumulateRotaton < maxRotaion) {
            System.out.println(location + " Tire 수명 : " + (maxRotaion + accumulateRotaton) + "회");
            return true;
        } else {
            System.out.println("**** " + location + "Tire 펑크 ***");
            return false;
        }

    }
}
