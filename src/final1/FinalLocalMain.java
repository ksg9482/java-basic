package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수1
        final int data1;
        data1 = 10;
        //data1 = 20; //컴파일 오류

        //final 지역변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류

        method(10);
    }

    static void method(final int parameter) {
        //parameter = 20; //컴파일 오류. 매개변수로 받은 값을 재할당 못함.
    }
}
