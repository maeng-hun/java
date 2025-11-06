package basic.loop;

public class GuguDan {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
        star();
    }
    
    public static void star() {
        System.out.println("star메서드");
    }
}
