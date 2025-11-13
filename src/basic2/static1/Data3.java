package basic2.static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
/*
static이 붙은 멤버 변수는 정적 변수(클래스 변수) -> 메서드 영역에서 관리
인스턴스 생성되지 않는다.
class Data3 {
 static int count;
}
 */
