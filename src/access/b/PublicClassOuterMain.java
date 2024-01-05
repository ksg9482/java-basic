package access.b;

//import access.a.DefaultClass1; //import해도 default는 다른 패키지 접근 못한다.
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //default는 다른 패키지에서 접근못한다.
        //DefaultClass1 defaultClass1 = new DefaultClass1();
    }
}
