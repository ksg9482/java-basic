package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지라서 그냥 호출 가능.
        pack.a.User user = new pack.a.User(); //원칙적으로 다른 패키지면 패키지 경로를 포함한 전체 이름으로 호출해야 한다.

    }
}
