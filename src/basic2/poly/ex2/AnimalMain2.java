package basic2.poly.ex2;

public class AnimalMain2 {

    public static void main(String[] args) {

        Animal[] animalsArray = {new Dog(), new Caw(), new Cat()};
        for (Animal animal : animalsArray) {
            animal.sound();
        }

        int[] arr = new int[] {1,2,3};
    }
}
