package basic.loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; ; i++) {
            sum += i;
            if (sum > 10) {
            System.out.println(sum);
                break;
            }
        }


    }
}
