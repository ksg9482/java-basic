package final1;

public class ConstructInit {
    final int value;

    public ConstructInit(int value) { //생성 시점에 생성자를 통해 한번만 초기화
        this.value = value;
    }
}
