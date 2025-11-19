package basic2.poly.interface1;

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("나용");
    }
    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }
}
