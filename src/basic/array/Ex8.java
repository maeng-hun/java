package basic.array;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject = {"국어", "영어", "수학"};

        System.out.print("학생 수를 입력하세요 : ");
        int studentCount = sc.nextInt();
        int[][] scores = new int[studentCount][studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subject[j] + "점수 : ");
                scores[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < studentCount; i++) {
            int total = 0;
                for (int j = 0; j < scores[i].length; j++) {
                    total += scores[i][j];
                }
            double avg = total / studentCount;
            System.out.println((i+1) + "번 학생의 총점 : " + total + " 평균 : " +avg );
        }

    }
}
