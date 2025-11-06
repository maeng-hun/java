package basic.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자 입력(exit: 종료) : ");
            String str = sc.nextLine();
            System.out.println(str);
            if (str.equals("exit")) {
                break;
            }
        }

    }
}
