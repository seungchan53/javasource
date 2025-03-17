package ch6_oop.src.poly;

public class Employee {
    private String name;
    private String positiom;

    public void work() {
        System.out.println(name + " " + positiom + "이(가) 일한다");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositiom() {
        return positiom;
    }

    public void setPositiom(String positiom) {
        this.positiom = positiom;
    }

}
