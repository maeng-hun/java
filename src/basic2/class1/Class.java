package basic2.class1;

public class Class {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15, 16, 17};
        int[] studentGrade = {90, 80, 70};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + " " + studentAges[i] + " " + studentGrade[i]);
        }
        // 배열의 한계: 각각 배열을 변경해야 한다.
        // 나이, 성적, 점수 따로 관리하는 것은 별로 고로 클래스 필요
    }
}
