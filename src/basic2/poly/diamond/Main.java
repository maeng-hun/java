package basic2.poly.diamond;

public class Main {
    public static void main(String[] args) {
        A a = new Child();
        a.methodA();
        a.methodCommon();

        B b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
