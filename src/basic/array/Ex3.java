package basic.array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > 4) {
                System.out.println("입력한 정수를 역순으로 출력");
                for (int j = 4; j < numbers.length; j--) {
                    System.out.print(numbers[j]);
                    if (j > 0) {
                        System.out.print(",");
                    }
                }
            }
        }

        }

}
