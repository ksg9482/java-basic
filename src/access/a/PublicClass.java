package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();//자기자신 생성
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
