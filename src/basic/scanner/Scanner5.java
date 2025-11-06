package basic.scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력하세요(0입력 종료):");
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
            System.out.println(sum);
        }
    }
}
