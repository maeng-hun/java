package basic.array;

public class ArrDi2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int i =1;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
               arr[j][k] = i++;
                System.out.println(arr[j][k]);
            }
        }
    }
}
