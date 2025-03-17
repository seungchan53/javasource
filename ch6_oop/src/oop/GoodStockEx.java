package ch6_oop.src.oop;

public class GoodStockEx {
    public static void main(String[] args) {
        // new GoodStock() : default 생성자를 호출하면서 인스턴스 생성
        GoodStock goodsStock = new GoodStock();
        // goodsStock.code = "p1013";
        // goodsStock.stockNum = 50;
        // GoodStock goodsStock = new GoodStock("p1013",50);

        goodsStock.code = "p1013";
        goodsStock.stockNum = 50;

        System.out.println(goodsStock);

        // 판매 - 5
        goodsStock.subtractStock(5);
        // 현재 재고 수량 확인
        System.out.println(goodsStock);

        // 제품 입고 10
        goodsStock.addStock(10);
        System.out.println(goodsStock);

    }
}
