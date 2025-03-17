package ch6_oop.src.oop;

public class StudentEx2 {
    public static void main(String[] args) {
        // Student 인스턴스 생성, 사용
        // 인스턴스 생성 시 생성자 사용함
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-1234", "hong@gmail.com");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // 홍길동 전화번호 변경
        student3.changeTel("010-1341-2681");
        System.out.println(student3);
    }
}
