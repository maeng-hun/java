package basic2.poly.overing;

public class Main {

    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("자식 -> 자식");
        System.out.println("value = " + child.value);
        child.method();
        
        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("value = " + parent.value);
        
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("부모->자식");
        System.out.println("value = " + poly.value);
        poly.method();
    }
    // 오버라이딩 된 메서드는 항상 우선권을 가진다
}
