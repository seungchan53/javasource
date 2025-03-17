package ch6_oop.src.extend;

import java.util.Scanner;

public class AccountEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CheckingAccount 의 생성자 호출
        // 부모의 인스턴스도 같이 생성됨
        CheckingAccount cAccount = new CheckingAccount("110 - 11", "hong", 10000, "123-1232");

        System.out.println("계좌번호 : " + cAccount.getAno());
        System.out.println("계좌주 : " + cAccount.getOwner());
        System.out.println("잔액 : " + cAccount.getBalance());
        System.out.println("체크카드번호 : " + cAccount.getCardNo());

        try {
            // System.out.println("현재잔액 : " + cAccount.pay("123-1232", 100000));
            System.out.println("현재잔액 : " + cAccount.pay("123-1232", 9000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        CreditLineAccount creditLineAccount = new CreditLineAccount("110-11", "hong", 10000, 50000);
        try {
            creditLineAccount.withdraw(50000);
            System.out.println("현재잔액 : " + creditLineAccount.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // BonuspointAccconut
        BonusPointAccount bonusPointAccount = new BonusPointAccount("110-11", "hong", 100000, 0);

        bonusPointAccount.deposit(100000);
        System.out.println("보너스포인트 : " + bonusPointAccount.getbonuspoint());

        CheckingTrafficAccount checkingTrafficAccount = new CheckingTrafficAccount("123", "HONG", 1000, "123-1232",
                false);
        CheckingTrafficAccount checkingTrafficAccount2 = new CheckingTrafficAccount("123", "HONG", 1000, "123-1232",
                true);

        try {
            System.out.println("교통카드 지불후 현재 잔액: " + checkingTrafficAccount2.payTrafficCard("123-1232", 100));
            System.out.println("현재 잔액 : " + checkingTrafficAccount.payTrafficCard("123-1232", 100));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
