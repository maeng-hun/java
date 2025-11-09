package basic.method;

public class Ex2 {

    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 5000);
        balance = withdraw(balance, 10000);
    }
    public static int deposit(int balance, int money) {
        balance += money;
        System.out.println(money + "원 입금 완료, 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원 출금 완료, 현재 잔액 : " + balance);
            return balance;
        } else if (balance < money) {
            System.out.println("잔액이 부족합니다");
        }
            return balance;
    }
}
