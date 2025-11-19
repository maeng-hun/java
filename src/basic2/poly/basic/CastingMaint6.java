package basic2.poly.basic;

public class CastingMaint6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    public static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 child메서드 실행
        if(parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
