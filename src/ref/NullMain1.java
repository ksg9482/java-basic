package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println(data); //메모리 주소가 없다
        data = new Data();
        System.out.println(data); //객체가 생성되어 메모리 주소가 변수에 할당
        data = null; //메모리 주소 제거. 이제 data인스턴스를 참조하지 않는다.
    }
}
