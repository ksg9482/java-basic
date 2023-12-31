package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        //절차지향3 - 메서드 추출
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어 작동");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume ++;
        System.out.println("볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume --;
        System.out.println("볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        if (data.isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
