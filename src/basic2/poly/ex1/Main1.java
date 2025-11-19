package basic2.poly.ex1;

public class Main1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Caw[] casArr = {caw};

        System.out.println("동물 소리");
        dog.sount();
        cat.sount();
        cat.sount();
    }

    private static void sound(Caw caw) {
        caw.sount();
    }
}
