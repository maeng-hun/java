package basic2.ref;

public class DataMain {
    public static void main(String[] args) {
        // dataA, dataB 둘 다 같은 참조값을 공유 하기 때문에
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println(dataA);
        System.out.println(dataB);
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);
    }
}
