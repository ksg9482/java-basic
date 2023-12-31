package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        //절차지향2 - 데이터 묶음
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("플레이어 작동");
        //볼륨 증가
        data.volume ++;
        System.out.println("볼륨: " + data.volume);
        //볼륨 감소
        data.volume --;
        System.out.println("볼륨: " + data.volume);
        //음악 플레이어 상태
        if (data.isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }
}
