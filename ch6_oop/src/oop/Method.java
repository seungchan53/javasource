package ch6_oop.src.oop;

// 메소드 : () 리턴타입 메소드명(){}
// 리턴(반환) 타입 : 기본타입(정수형,불린형,문자형,실수형), 객체(대문자로 시작), 배열, void(리턴타입 없음)

public class Method {

    int method1() {

        int sum = 15;

        // return 0;
        return sum;
    }

    String method2() {

        String str = "Hello";
        // return "";
        // return null;
        return str;
    }

    double Method3() {
        return 35.5;
    }

    char Method4() {
        return ' ';
    }

    void Method5() {
        return; // return은 없어도 되고 있어도 되는것
    }

    // 매개변수가 있는 메서드
    // 매개변수 : 기본타입(정수형,불린형,문자형,실수형), 객체(대문자로 시작), 배열,
    // 개수 상관 없음
    int add(int x, int y) {
        return x + y;
    }

    float add2(int x, float y) {
        // float + int : float
        return x + y;
    }

    void print(String name, String id) {
        System.out.println(name + ": " + id);
    }

    int[] arr(int[] arr1) {
        return arr1;
    }

}
