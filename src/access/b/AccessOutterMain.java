package access.b;

import access.a.AccessData;

public class AccessOutterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //pubic 호출가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 호출불가능
        //data.defaultField = 2;
        //data.defaultMethod();

        //private 호출불가능
        //data.privateField = 3;
        //data.privateMethod();

        //innerAccess는 메서드라 클래스 내부 호출. private에 접근할 수 있다.ㅠ
        //메서드 자체는 public이라 다른 패키지에서 호출 가능.
        data.innerAccess();
    }
}
