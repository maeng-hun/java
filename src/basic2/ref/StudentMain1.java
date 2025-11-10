package basic2.ref;

public class StudentMain1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 20, 80);

        printStudent(student1);

    }
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println(student.age +  student.name + student.grade);
    }
}
