package ch6_oop.src.oop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString // tostring 메소드 생성
@AllArgsConstructor // 멤버 변수 전부 선택해서 생성자
@NoArgsConstructor // default 생성자
@Getter //
@Setter //
public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    // 110-10-0100

    // 생성자(default, 멤버변수 3개 초기화)
    // toString
    // public Account() {
    // }

    // public Account(String ano, String owner, int balance) {
    // this.ano = ano;
    // this.owner = owner;
    // this.balance = balance;
    // }

    private String ano;
    private String owner;
    private int balance;

    // public String getAno() {
    // return ano;
    // }

    // public String getOwner() {
    // return owner;
    // }

    // public int getBalance() {
    // return balance;
    // }

    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // deposit, withdraw
    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        // 인출액이 잔액보다 작으면 출금
        if (amount > balance)
            return;
        this.balance -= amount;
    }

    // @Override
    // public String toString() {
    // return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance +
    // "]";
    // }

}