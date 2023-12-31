package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println(bigData.count); //0
        System.out.println(bigData.data); //new Data()로 생성하면 메모리 할당
        System.out.println(bigData.data.value); //data.value는 int타입. 초기값 0.
    }
}
