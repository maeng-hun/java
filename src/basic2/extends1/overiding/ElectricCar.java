package basic2.extends1.overiding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차를 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
