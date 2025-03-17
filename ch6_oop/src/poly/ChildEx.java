package ch6_oop.src.poly;

public class ChildEx {
    public static void main(String[] args) {
        Child child1 = new Child();
        Parent parent = new Child(); // 단 오버라이딩 된 메서드가 있다면 오버라이딩 된게 실행됨

        // child1.method1();
        // child1.method2();
        // child1.method3();

        // parent 접근 범위
        // parent.field1;
        parent.method1(); // parent method1()
        parent.method2(); // Child method2()

        // method method3() is undefined
        // parent.method3();

        // method3 사용
        // 부모 = 자식(o)
        Child child2 = (Child) parent;
        child2.method3();

        // java.lang.ClassCastException: class ch6_oop.src.poly.Parent
        // 자식 = 부모 (x)
        Parent parent2 = new Parent(); // 인스턴스 자체가 틀림 생선된 Parent 부모는 자식으로 강제 캐스팅이 안됨
        child2 = (Child) parent2;
        child2.method3();
    }
}
