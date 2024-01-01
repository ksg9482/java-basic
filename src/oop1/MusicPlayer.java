package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("플레이어 작동");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp(){
        volume ++;
        System.out.println("볼륨: " + volume);
    }

    void volumeDown(){
        volume --;
        System.out.println("볼륨: " + volume);
    }

    void showStatus(){
        if (isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
