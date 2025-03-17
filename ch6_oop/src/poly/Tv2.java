package ch6_oop.src.poly;

public class Tv2 {
    // 크기(int), 색상(), 채널(), 볼룸(int)
    int channel;
    boolean power;

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void power() {
        power = !power;
    }

    @Override
    public String toString() {
        return "Tv [channel=" + channel + ", power=" + power + "]";
    }

}
