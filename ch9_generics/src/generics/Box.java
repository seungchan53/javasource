package generics;

public class Box {

    Object item;

    public void setITem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();
        box.setITem(new String("자바"));
        String result = (String) box.getItem();

        box.setITem(Integer.valueOf(1));
        int i = (int) box.getItem();

    }

}