package basic2.static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter(); //x001

        Data2 data = new Data2("A", counter);
        System.out.println("A Count : " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B Count : " + counter.count);

    }
}
