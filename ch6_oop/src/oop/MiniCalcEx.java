package ch6_oop.src.oop;

public class MiniCalcEx {
    public static void main(String[] args) {
        // prict() 메소드 호출
        // 클래스메서드이기 때문에 객체 생성없이 클래스 이름. 으로 호출가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // execute() 호출
        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 7;

    }
}
