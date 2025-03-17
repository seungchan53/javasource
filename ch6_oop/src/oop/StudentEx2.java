package ch6_oop.src.oop;

public class StudentEx2 {
    public static void main(String[] args) {
        // Student 인스턴스 생성, 사용
        // 인스턴스 생성 시 생성자 사용함
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-1234", "hong@gmail.com");
        Student student4 = new Student("s1234567", "강산", 2, 3, "010-1234-1234", "hong@gmail.com");

        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);

        StudentInfo(student3);
        // System.out.println("===============================");
        // System.out.println("아이디 : " + student3.getStuId());
        // System.out.println("이름 : " + student3.getName());
        // System.out.println("학년 : " + student3.getGrade());
        // System.out.println("반 : " + student3.getClassNum());
        // System.out.println("전화번호 : " + student3.getPhone());
        // System.out.println("이메일 : " + student3.getEmail());
        // System.out.println("===============================");

        System.out.println();

        StudentInfo(student4);
        // System.out.println("===============================");

        // 홍길동 전화번호 변경
        student3.changeTel("010-1341-2681");
        System.out.println(student3);
    }

    public static void StudentInfo(Student student) {
        System.out.println("===============================");
        System.out.println("아이디 : " + student.getStuId());
        System.out.println("이름 : " + student.getName());
        System.out.println("학년 : " + student.getGrade());
        System.out.println("반 : " + student.getClassNum());
        System.out.println("전화번호 : " + student.getPhone());
        System.out.println("이메일 : " + student.getEmail());
        System.out.println("===============================");
    }

}
