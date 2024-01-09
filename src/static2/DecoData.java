package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수, compile error
        //instanceMethod(); //인스턴스 메서드, compile error

        staticValue++; //정적변수 접근
        staticMethod(); //정적메서드 접근
    }

    public static void staticCall2(DecoData decoData) {
        decoData.instanceValue++; //인스턴스 변수, compile error
        decoData.instanceMethod(); //인스턴스 메서드, compile error

    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수
        instanceMethod(); //인스턴스 메서드

        staticValue++; //정적변수 접근, 이건 사실 DecoData.staticValue와 같다.
        staticMethod(); //정적메서드 접근
    }

    private void instanceMethod() {

    }

    static private void staticMethod() {

    }
}
