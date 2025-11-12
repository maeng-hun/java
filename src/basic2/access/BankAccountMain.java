package basic2.access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.withdraw(300);
        System.out.println("잔액 : " + bankAccount.getBalance());


    }
}
