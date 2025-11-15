package basic2.final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화 ");
        ConstructIInit constructIInit1 = new ConstructIInit(10);
        ConstructIInit constructIInit2  = new ConstructIInit(20);

        System.out.println(constructIInit1.value);
        System.out.println(constructIInit2.value);

        // 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
