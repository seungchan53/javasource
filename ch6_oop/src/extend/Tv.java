package ch6_oop.src.extend;

public class Tv {
    // 크기(int), 색상(), 채널(), 볼룸(int)
    int channel;
    boolean power;

    void channelUp() {
        channel++;
    }

    void dhannelDown() {
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
