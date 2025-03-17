package ch6_oop.src.inter;

interface I {
    void methodB();
}

class AA {
    public void methodA(I i) {
        i.methodB();
    }
}

class BB implements I {

    @Override
    public void methodB() {
        System.out.println("methodB()");
    }
}

class InterFaceTest2 {
    public static void main(String[] args) {
        AA obj1 = new AA();
        obj1.methodA(new BB());
    }
}
