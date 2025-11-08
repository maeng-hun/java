package basic.method;

public class Method3 {
    public static void main(String[] args) {
        boolean result = odd(1);
        System.out.println(result);
    }

    public static boolean odd(int a){
        if (a % 2 == 1) {
            return true;
        }
        return false;
    }
}
