package basic2.poly.ex4;

public class Chicken extends Animal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }
    
    @Override
    public void fly() {
        System.out.println("닭 날기");
    }
}
