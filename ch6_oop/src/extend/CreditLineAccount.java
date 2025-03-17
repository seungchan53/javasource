package ch6_oop.src.extend;

// qnahrk default 생성자가 없으면 안됨
public class CreditLineAccount extends Account {
    private int CreditLine; // 마이너스 한도

    // CreditLineAccount(){
    // super();
    // }

    public CreditLineAccount(String ano, String owner, int balance, int creditLine) {
        super(ano, owner, balance);
        CreditLine = creditLine;
    }

    // 오버라이딩
    // 잔액 + 마이너스 - 사용액

    @Override
    void withdraw(long amount) throws Exception {
        if (super.getBalance() + this.CreditLine < amount) {
            throw new Exception("한도 범위를 초과합니다");
        }
        super.setBalance(super.getBalance() - amount);
    }
}
