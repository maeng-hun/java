package basic2.static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count : " + data1.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count : " + data2.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count : " + data3.count);

        // 추가 인스턴스 접근(권장x) -> 가독성 떨어짐 인스턴스 변수인가?
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        // 클래스 접근 가독성 좋음 -> static 변수네!
        System.out.println(Data3.count);
    }
}
