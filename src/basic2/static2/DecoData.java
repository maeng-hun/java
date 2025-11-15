package basic2.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue; // static은 static만 접근 가능

    public static void staticCall(){
        //intstacneValue++; 인스턴스 변수 접근 ,
        //instanceMethode(); 인스턴스 메서드 , -> 둘 다 컴파일 에러ㅏ
        
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall(){ // 인스턴스는 모든 곳에 접근 가능
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }
    private void instanceMethod(){
        System.out.println("instanceMethod: " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticMethod: " + staticValue);
    }
}
