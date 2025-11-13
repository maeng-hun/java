package basic2.static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data data = new Data("A");
        System.out.println("1. count : " + data.count);

        Data data1 = new Data("B");
        System.out.println("2. count : " + data.count);
    }
}
