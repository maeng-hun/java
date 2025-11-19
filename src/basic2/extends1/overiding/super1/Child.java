package basic2.extends1.overiding.super1;

public class Child extends Parrent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("자식.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);
        this.hello();
        super.hello();

    }
}
