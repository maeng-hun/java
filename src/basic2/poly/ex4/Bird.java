package basic2.poly.ex4;

public class Bird extends Animal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날다");
    }
}
