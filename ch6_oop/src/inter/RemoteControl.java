package ch6_oop.src.inter;

public interface RemoteControl {
    // 상수(final static), 추상메서드(abstract), default, static 메서드
    final static int MAX_VOLUME = 10;
    final static int MIX_VOLUME = 0;

    // pubilc, abstract 붙이지 않아도 추상 메서드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리 합니다");
        } else {
            System.out.println("무음 해제합니다");
        }
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다");
    }
}
