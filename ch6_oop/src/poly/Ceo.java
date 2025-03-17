package ch6_oop.src.poly;

public class Ceo extends Employee {
    @Override
    public void work() {
        System.out.println(getName() + " " + getPositiom() + " 이(가) 업무를 봅니다.");
    }
}

class partTime extends Employee {
    @Override
    public void work() {
        System.out.println(getName() + " " + getPositiom() + "주어진 시간동안 일을 합니다.");
    }
}

class Admin extends Employee {
    @Override
    public void work() {
        System.out.println(getName() + " " + getPositiom() + "열심히 일을 합니다.");
    }
}