package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //pubic 호출가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출불가능
        //data.privateField = 3;
        //data.privateMethod();

        //innerAccess는 메서드라 클래스 내부 호출. private에 접근할 수 있다.ㅠ
        data.innerAccess();
    }
}
