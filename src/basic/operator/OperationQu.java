package basic.operator;

public class OperationQu {
    public static void main(String[] args) {
        int num1=10, num2=20, num3=30;
        int sum =  num1 + num2 + num3;
        int average =  sum / 3;
        System.out.println(average);
        System.out.println(sum);

        double val1 = 1.5, val2 = 2.5, val3 = 3.5;
        double sum2 = val1 + val2 + val3;
        double avg =  sum2 / 3;
        System.out.println(sum2);
        System.out.println(avg);

        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
