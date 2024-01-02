package pack;

import pack.a.User; //import를 통해 등록. (*)를 사용하면 다 가져올 수 있음. package.a.*

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지라서 그냥 호출 가능.
        User user = new User(); //원칙적으로 다른 패키지면 패키지 경로를 포함한 전체 이름으로 호출해야 한다.

    }
}
