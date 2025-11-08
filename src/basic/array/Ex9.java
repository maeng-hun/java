package basic.array;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;
        
        while (true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int choice = sc.nextInt();

            if (choice == 1 && productCount < 10){
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCount] = sc.next();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[productCount] = sc.nextInt();
                productCount++;
            } else if (choice == 2 ) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i]);
                }
            } else if (choice == 1 && productCount >= 10){
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
                break;
            } else {
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
