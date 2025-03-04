package ch6_oop.src.oop;

import java.time.LocalDate;

public class Product {
    // 속성
    // 제품번호(p485148), 제품명(운동화), 가격(124000), 제조년월(2025-03-04)
    String pcode;
    String pName;
    int price;
    LocalDate regiDate;

    // 생성자 : 개발자가 명시하지 않으면 컴파일러가 defalut로 자동 생성
    // Product (){}

    // 기능 - 가격 변경
    void changeprice() {

    }

    @Override
    public String toString() {
        return "product [pcode=" + pcode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }
}
