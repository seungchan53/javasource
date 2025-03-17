package ch6_oop.src.oop;

//오버로딩
// 메서드 오버로딩 : 한 클래스내에 같은 이름의 메서드를 여러 개 정의하는 것
// 생성자 오버로딩 : 한 클래스내에 같은 이름의 생성자를 여러 개 정의하는 것

public class MyMath {
    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    long add(int a[]) {
        System.out.println("int add(int a, int b)");
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

}
