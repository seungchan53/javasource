package ch6_oop.src.oop;

public class CardEx1 {
    public static void main(String[] args) {

        // static 으로 선언된 변수와 메서드는 클래스이름. 접근

        System.out.println("카드 너비" + Card.width);
        System.out.println("카드 높이" + Card.heigth);

        Card card = new Card();
        card.kind = "Heart";
        card.number = 7;
        // card.height = 200;

        Card card2 = new Card();
        card.kind = "Spade";
        card.number = 7;

    }
}
