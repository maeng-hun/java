package basic.scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번 째 숫자 두번 째 숫자 모두 0을 입력하면 프로그램 종료");

        while (true) {
            System.out.print("첫 번째 숫자 입력: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자 입력: ");
            int num2 = sc.nextInt();
            if (num1==0 && num2==0){
                break;
            }
            System.out.println(num1+num2);
        }
    }
}
