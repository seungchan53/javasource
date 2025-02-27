package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        // for (int i = 0; i < args.length; i++) {
        // System.out.println("안녕하세요");

        //무한푸트 : 반복문이 멈추지 못하는 경우

        int i = 0;
        while (i < 5) {
            System.out.println("안녕하세요");
            i++;
        }

    }
}
