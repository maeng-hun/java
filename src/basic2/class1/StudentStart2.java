package basic2.class1;

public class StudentStart2 {
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

        Student[] students = new Student[2]; //x005
        students[0] = student;
        students[1] = student2;

        System.out.println("student1 객체 주소 : " + student);
        System.out.println("student2 객체 주소 : " + student2);
        System.out.println("배열 0번 인덱스 : " + students[0]);
        System.out.println("배열 1번 인덱스 : " + students[1]);
        System.out.println("배열 참조값 : " + students);
        // 참조값 잘 알아야 함 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달

        // 배열에 들어있는 객체 사용 : 배열에 접근 ->
        System.out.println(students[0].name);
        System.out.println(students[0].toString());
    }
}
