package ch6_oop.src.oop;

//* OOP(Obiect Oriented Programming = 객체 지향)
// 재사용성 높음
// 코드의 관리가 용이함
// 신뢰성 높은 프로그램 작성

// 클래스 : 객체 정의, 설계도, 틀
// 클래스 용도 : 객체 생성

// 객체 : 사물(책상,의자,자동차,TV), 개념(수학공식

// 붕어빵 기계(클래스) - 붕어빵(객체

// 객체와 인스턴스
// 인스턴스 : 어떤 클래스로부터 만들어진 객체
// 책상은 책상 클래스의 인스턴스다

public class ClassEx1 {
    public static void main(String[] args) {
        // 인스턴스 생성
        // 클래스명 변수명 = new 클래스명 ();
        Tv tv = new Tv();
        Tv tv2 = new Tv();

        // 속성 확인
        System.out.println(tv); // Tv@5ca881b5 => Tv [size=0, color=0, channel=0, volume=0, power=false]
        System.out.println(tv2); // Tv@24d46ca6 => Tv [size=0, color=0, channel=0, volume=0, power=false]

        // 인스턴스의 사용
        tv.color = "black";
        tv.channelUp();
        System.out.println("현재채널 : " + tv.channel);
        System.out.println("tv 색상 : " + tv.color);

        // 메소드 : ()
        tv2.power(); // 메소드 호출(메소드 실행)
        tv.channel = 8;
        tv2.volume = 22;
        System.out.println(tv2);

    }
}
