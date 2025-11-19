package basic2.poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child);
        Parent parnet1 = (Parent) child; //업캐스팅은 생략 가능, 생략 권장
        Parent parnet2 = child; // 업캐스팅 생략
        System.out.println(parnet2);

        parnet1.parentMethod();
        parnet2.parentMethod();

    }
}
