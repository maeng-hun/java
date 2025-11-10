package basic2.ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 참조 값을 만들어라!
        System.out.println(bigData.count);
        System.out.println(bigData.data);

        //
        System.out.println(bigData.data.value);
    }
}
