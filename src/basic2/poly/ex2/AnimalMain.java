package basic2.poly.ex2;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();
        soundAnimal(dog);
        soundAnimal(caw);
        soundAnimal(cat);

    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
