package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) { //volume필드에 직접접근 가능하니 막는게 소용 없음
            System.out.println("max volume");
        } else {
            volume += 10;
            System.out.println("volume up 10");
        }
    }

    void volumeDonw() {
        volume -= 10;
        System.out.println("volume down 10");
    }

    void showVolume() {
        System.out.println("current volume: " + volume);
    }
}
