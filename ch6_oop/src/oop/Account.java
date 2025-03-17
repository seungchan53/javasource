package ch6_oop.src.oop;

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    // 110-10-0100
    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // deposit, withdraw

    // 생성자(default, 멤버변수 3개 초기화)
    // toString
    String ano;
    String owner;
    int balance;

    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        this.balance -= amount;
    }

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}