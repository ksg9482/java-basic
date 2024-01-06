package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    void increMent() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다");
        } else {
            count ++;
        }
    }

    int getCount() {
        return count;
    }
}
