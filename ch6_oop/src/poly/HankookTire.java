package ch6_oop.src.poly;

public class HankookTire extends Tire {

    public HankookTire(int maxRotaion, String location) {
        super(maxRotaion, location);
    }

    @Override
    public boolean roll() {
        ++accumulateRotaton;

        if (accumulateRotaton < maxRotaion) {
            System.out.println(location + " HankookTire 수명 : " + (maxRotaion + accumulateRotaton) + "회");
            return true;
        } else {
            System.out.println("**** " + location + "HankookTire 펑크 ***");
            return false;
        }

    }
}
