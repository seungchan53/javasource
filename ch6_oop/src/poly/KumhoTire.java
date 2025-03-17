package ch6_oop.src.poly;

public class KumhoTire extends Tire {

    public KumhoTire(int maxRotaion, String location) {
        super(maxRotaion, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotaton;

        if (accumulateRotaton < maxRotaion) {
            System.out.println(location + " KumhoTire 수명 : " + (maxRotaion + accumulateRotaton) + "회");
            return true;
        } else {
            System.out.println("**** " + location + "KumhoTire 펑크 ***");
            return false;
        }

    }
}
