package ch2;

public class SamsungTv implements Tv {
    @Override
    public void powerOn() {
        System.out.println("SamsunTv - 파워 On");
    }

    @Override
    public void powerOff() {
        System.out.println("SamsunTv - 파워 off");
    }

    @Override
    public void volumeUp() {
        System.out.println("SamsunTv - volumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("SamsunTv - volumeDown");
    }
}