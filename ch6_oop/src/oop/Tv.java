package ch6_oop.src.oop;

public class Tv {
    int size;
    String color;
    int channel;
    int volume;
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
        return "Tv [size=" + size + ", color=" + color + ", channel=" + channel + ", volume=" + volume + ", power="
                + power + "]";
    }

}
