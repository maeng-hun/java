package basic.method;

public class Ex1 {

    public static void main(String[] args) {
        double a = avg(3,4,5);
        System.out.println(a);
        printMessage("안녕", 3);

    }
    public static double avg(int a, int b, int c) {
        double avg = (a+b+c)/3.0;
        return avg;

    }

    public static void printMessage(String msg, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(msg);
        }
    }
}
