package ch6_oop.src.oop;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("홍길동");
        p1.setPno("123");
        p1.setTel("010-4568-1536");
        System.out.println(p1); // Person(pno=123, name=홍길동, tel=010-4568-1536)

        Person p = new Person(null, null, null);

        Person p2 = new Person2();
        p2 = new Person2(null);

        Person2 person2 = Person2.builder()
                .pno("4567")
                .name("성춘향")
                .tel("010")
                .build();

    }
}
