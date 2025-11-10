package basic2.oop;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayer music =  new MusicPlayer();

        music.on();
        music.volumeUp();
        music.volumeDown();
        music.showState();
        music.off();
    }
}
