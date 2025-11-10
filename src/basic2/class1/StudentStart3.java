package basic2.class1;

public class StudentStart3 {
    public static void main(String[] args) {
        Student student;
        student = new Student(); //x001
        student.name = "학생1";
        student.age = 20;
        student.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 22;
        student2.grade = 80;

        Student[] students = {student, student2};

//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].name + students[i].age + students[i].grade);
//        }

        for (Student s : students) {
            System.out.println(s.name + s.age + s.grade);
        }

    }
}
