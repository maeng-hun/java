package basic.scanner;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
            int sum = 0;
            int count = 0;
            double average = 0;
            int input = 0;
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                System.out.println("입력한 숫자들의 합계: " + sum);
                System.out.println("입려한 숫자들의 평균: " + average);
                break;
            }
            sum += num;
            count++;
            average = (double) sum /count;

        }
//        while ((input = sc.nextInt()) != -1){
//            sum += input;
//            count++;
//        }
    }
}
