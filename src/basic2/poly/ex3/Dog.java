package basic2.poly.ex3;

public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("강아지 이동");
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
