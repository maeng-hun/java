package basic2.oop;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        // 절차지향프로그램
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어 시작");
        volume++;
        System.out.println("볼륨 증가 : " + volume);
        volume--;
        System.out.println("볼륨 감소 : " + volume);

        System.out.println("음악플레잉 상태 확인");
        if (isOn){
            System.out.println(isOn);
        } else {
            System.out.println(isOn);
        }
        isOn = false;
        System.out.println(isOn + "음악 플레이어 종료");
    }
}
