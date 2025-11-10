package basic2.oop;

public class MusicPlayer {
   // oop , 캡슐화
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println(isOn + "음악 플레이어를 시작합니다!");
    }

    void off() {
        isOn = false;
        System.out.println(isOn + "음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        volume++;
        System.out.println(volume + "볼륩 up!");
    }
    void volumeDown() {
        volume--;
        System.out.println(volume + "볼륨 Down!");
    }
    void showState() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }


}
