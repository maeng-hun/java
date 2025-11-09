package basic.method;

public class Method7 {
    public static void main(String[] args) {
        int num = 5;
        num = changeNumber(num);
        System.out.println("3: " + num);
    }

    public static int changeNumber(int num) {
        num = num * 2;
        return num;
    }
}