package basic.method;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        
        while (true) {
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int amount = sc.nextInt();
                balance = deposit(balance,amount);
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int amount = sc.nextInt();
                balance = withdraw(balance, amount);
            } else if (choice == 3) {
                System.out.println("현재 잔액 : " + balance);
            } else {
                System.out.println("프로그램 종료");
                return;
            }

        }
    }
    public static int deposit(int balance, int amount) {
        balance +=  amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance );
        return balance;
    }
    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -=  amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 : " + balance );
            return balance;
        } else if (balance < amount) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
