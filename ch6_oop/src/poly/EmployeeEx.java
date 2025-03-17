package ch6_oop.src.poly;

public class EmployeeEx {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("홍길동");
        employee1.setPositiom("사원");
        // employee1.work();
        dowork(employee1);

        employee1 = new Ceo();
        employee1.setName("김동호");
        employee1.setPositiom("대표");
        // employee1.work();
        dowork(employee1);

        employee1 = new partTime();
        employee1.setName("이민지");
        employee1.setPositiom("시간제");
        // employee1.work();
        dowork(employee1);

        employee1 = new Admin();
        employee1.setName("관리자");
        employee1.setPositiom("admin");
        // employee1.work();
        dowork(employee1);
    }

    static void dowork(Employee e) {
        e.work();
    }
}
