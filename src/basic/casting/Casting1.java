package basic.casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println(longValue);

        doubleValue = intValue; // int -> double
        System.out.println(doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println(doubleValue);

        // 작은 것에 큰 타입 형변환은 자동 형변환 가능
    }
}
