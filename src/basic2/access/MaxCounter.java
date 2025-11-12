package basic2.access;

public class MaxCounter {

    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (countVaild()) {
            count++;
            System.out.println("현재 숫자 : " + count);
        } else {
            System.out.println("현재 최대값이라 증가할 수 없습니다.");
        }
    }

    public int getCount() {
        return count;
    }
    private boolean countVaild() {
        return max > count;
    }
}
