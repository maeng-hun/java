package basic2.ref;

public class StudentMain2 {
    public static void main(String[] args) {
        Student student = createStudent("명훈",  28, 80);
        printStudent(student);

    }
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student) {
        System.out.println(student.age +  student.name + student.grade);
    }
}
