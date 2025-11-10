package basic2.oop;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        // 절차지향프로그램
        MusicPlayerData data = new MusicPlayerData();
        play(data);

        volumeUp(data);
        volumeDown(data);
        showStatus(data);

        stop(data);

    }
    // 모듈화
    static void play(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }
    static void stop(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨 up");
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨  down");
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악플레잉 상태 확인");
        if (data.isOn){
            System.out.println(data.isOn);
        } else {
            System.out.println(data.isOn);
        }
    }
}
