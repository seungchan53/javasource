package ch6_oop.src.oop;

// static 메서드 : 클래스 메서드

public class PrimitiveParamEx {

    public static void main(String[] args) {
        // main 메서드
        Data d = new Data();
        d.x = 100;
        System.out.println("main() : x = : " + d.x);
        change(d.x);
        change2(d);
        System.out.println("After change() ");
        System.out.println(d.x);
        // PrimitiveParamEx obj = new PrimitiveParamEx();
        // obj.change();
    }

    static void change(int x) {
        x = 10000;
        System.out.println("change() : x = " + x);
    }

    // d를 넘기면 주소복제가 된다
    // 값을 전달하는 방식이 다르다
    static void change2(Data d) {
        d.x = 10000;
        System.out.println("change2() : d.x = " + d.x);
    }

}
