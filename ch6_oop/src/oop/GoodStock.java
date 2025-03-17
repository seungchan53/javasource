package ch6_oop.src.oop;

public class GoodStock {
    // 속성 : code(상품코드-p1013), stockNum(재고수량 - 50)
    String code;
    int stockNum;

    // 생성자
    public GoodStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    // 디폴트 생성자
    // public GoodStock() {
    // }

    // 기능 : 재고 추가한다, 재고 감소한다
    void subtractStock(int num) {
        this.stockNum -= num;
    }

    void addStock(int num) {
        this.stockNum += num;
    }

    @Override
    public String toString() {
        return "GoodStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

}
