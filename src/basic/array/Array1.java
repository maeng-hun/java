package basic.array;

public class Array1 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5]; // 배열 생성(초기화) -> 참조값(x001) 보관 시언어가 생각난다.
        System.out.println(students); //메모리참조값 16진수

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        // 기본형 타입과 참조형 타입

    }
}
