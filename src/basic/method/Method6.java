package basic.method;

public class Method6 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("처음 num1 : " + num1);
        changeNumber(num1);
        System.out.println("호출 후 : " + num1); // 2. 고로 당연히 이 값은 5이다!!!
    }

    public static void changeNumber(int num2) { // 1. 값만 복사해서 넘겨준다!
        num2 = num2 *2;
    }
}

// 자바는 항상 변수의 값을 대입한다!!   -> 매우 중요!
