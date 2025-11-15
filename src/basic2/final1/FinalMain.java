package basic2.final1;

public class FinalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10;

        final int data2 = 10;
    }

    static void method(final int parameter) {
        //paramete = 20; 당연히 상수라 변경 불가능
    }
}
