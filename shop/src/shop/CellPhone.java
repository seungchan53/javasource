package shop;

public class CellPhone extends Product {

    private String carrier;

    public CellPhone(String pname, int price, String carrier) {
        super(pname, price);
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.println("해상도 : " + this.carrier);
    }

}
