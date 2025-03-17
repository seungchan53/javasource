package generics;

public class Box2<T> {

    T item;

    public void setITem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class BoxEx {
    public static void main(String[] args) {
        Box2<String> box = new Box2<>();
        box.setITem("자바");
        // box.setITem(1);

        String result = box.getItem();

        Box2<Integer> box2 = new Box2<>();
        box2.setITem(1);
        int i = box2.getItem();

    }

}