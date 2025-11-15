package basic2.static2;

public class DecoDataMain3 {

    public static void main(String[] args) {
        System.out.println("정적 호출");
        DecoData.staticCall();

        System.out.println("인스턴스 호출");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
