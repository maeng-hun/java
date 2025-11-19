package basic2.poly.abstract1;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        dog.sound();
        caw.sound();

    }
}
