package basic.cond;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력 : ");
        int score = sc.nextInt();
        String grage;
      if(score>=90) {
          System.out.println(grage = "A");
      } else if (score >=80) {
          System.out.println(grage = "B");
      } else if (score>=80) {
          System.out.println(grage = "C");
      } else {
          System.out.println(grage = "D");
      }

    }
}
