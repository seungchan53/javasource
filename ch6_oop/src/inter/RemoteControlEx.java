package ch6_oop.src.inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(8);
        rc.setMute(true);
        rc.turnOff();

        RemoteControl.changeBattery();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // 익명 구현 클래스
        rc = new RemoteControl() {

            @Override
            public void turnOn() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'turnOn'");
            }

            @Override
            public void turnOff() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
            }

            @Override
            public void setVolume(int volume) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'setVolume'");
            }

        };

        rc.turnOn();
        rc.turnOff();
    }
}
