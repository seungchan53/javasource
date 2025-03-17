package ch6_oop.src.poly;

public class BuyerEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // buyer가 Tv를 산다
        // (new Tv()) = Tv tv = new Tv();
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        buyer.summary();

        // System.out.println("남은 돈은 " + buyer.money + " 만원입니다.");
        // System.out.println("현재 보너스 점수는 " + buyer.bonusPoint + " 입니다.");

        // 여러 객체를 한꺼번에 다르기 - 배열객체
        // 상속관계가 없을 때 코드 작성
        // Computer computer[] = new Computer[3];
        // Tv tv[] = new Tv[3];
        // Audio Audio[] = new Audio[3];

        // computer[0] = new Computer();
        // computer[1] = new Computer();
        // computer[2] = new Computer();

        // tv[0] = new Tv();

        // Audio[0] = new Audio();

        // buyer.buy(computer);
        // buyer.buy(tv);
        // buyer.buy(Audio);

        // 상속관계 => 매개변수 다형성
    }
}
