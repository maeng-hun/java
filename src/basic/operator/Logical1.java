package basic.operator;

public class Logical1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

        int aa = 15;
        boolean result = aa > 10 && aa < 20; // (a>10) && (a<20)
        System.out.println("reslut=" + result);
    }
}
