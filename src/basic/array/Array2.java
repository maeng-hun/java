package basic.array;

public class Array2 {
    public static void main(String[] args) {
        int[] students = new int[]{90,80,70,60,50};
        // int[] students = {90,80,70,60,50}; 위랑 동일 java가 추론함

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}
