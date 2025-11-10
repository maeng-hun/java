package basic2.class1;

public class StudentStart {
    public static void main(String[] args) {
        Student student;
        student = new Student();
        student.name = "학생1";
        student.age = 20;
        student.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 22;
        student2.grade = 80;

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student.name + student.age + student.grade);
        System.out.println(student2.name + student2.age + student2.grade);
    }
}
