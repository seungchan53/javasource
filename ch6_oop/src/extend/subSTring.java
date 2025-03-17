package ch6_oop.src.extend;

// 오버라이딩

// 조건
// - 이름이 같아야 한다.
// - 매개변수가 같아야 한다.
// - 반환 타입이 같아야 한다.

// 재정의 : 부모가 정의해 주는 내용을 자식에 맞춰서 변경하는 개념
// super 부모의 것을 부르기

// 오버로딩(overloading) vs 오버라이딩(overriding)
// 오버라이딩 : 상속, 상속받은 메서드의 내용을 변경하는것
// 오버로딩 : 클래스 하나에서만 나옴, 한 클래스에서 동일한 메서드를 여러개 정의합니다 

public class subSTring extends ListSTring {
    String name = "성춘향";

    @Override
    public void list() {
        // 부모의 list() 호출
        super.list();
        System.out.println(name + " 하위 클래스 이름");
    }

    public void print() {
        list();
        super.list();
        exec(); // super.exec();
    }

}
