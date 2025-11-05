package basic.operator;

public class Comp1 {
    public static void main(String[] args) {
        int a =2;
        int b =3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        boolean result = a == b;
        System.out.println(result);

        // .equals
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hellow".equals("hellow");
        boolean result2 = str1.equals("문자열1");
        boolean result3 = str1.equals(str2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
