package basic2.poly.interface1;

public class Main1 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        sound(cat);
        sound(dog);
        sound(caw);
        move(cat);
        move(dog);
        move(caw);

    }
    private static void sound(Animal animal) {
        animal.sound();
    }

    private static void move(Animal animal) {
        animal.move();
    }
}
