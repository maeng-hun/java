package basic2.poly.ex3;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sound(dog);
        move(dog);
        sound(cat);
        move(cat);
        sound(caw);
        move(caw);
    }

    private static void sound(Animal animal) {
        animal.sound();
    }
    private static void move(Animal animal) {
        animal.move();
    }
}
