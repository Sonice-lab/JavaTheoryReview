package sec04;


class BankAccount {
    // 1. 변수를 private으로 꽁꽁 숨김 (외부 접근 절대 불가)
    private int balance = 10000; 

    // 2. 잔액을 확인하고 싶을 때 쓰는 기능 (Getter)
    public int getBalance() {
        return balance;
    }

    // 3. 잔액을 변경하고 싶을 때 쓰는 기능 (Setter)
    public void setBalance(int amount) {
        if (amount < 0) {
            System.out.println("경고: 마이너스 금액은 입금할 수 없습니다!");
            return; // 이상한 값이 들어오면 차단해 버림!
        }
        this.balance = amount;
    }
}

public class Ex04_01 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        
        // myAccount.balance = 5000; // (에러 발생! 직접 접근 불가)
        
        // 반드시 지정된 메서드를 통해서만 안전하게 거래
        myAccount.setBalance(50000); 
        System.out.println("현재 잔액: " + myAccount.getBalance());
    }
}