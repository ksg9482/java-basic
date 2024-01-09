package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. static call");
        DecoData.staticCall();

        System.out.println("2. instance call1");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        //static 호출.
        DecoDataMain.mainMethodStaticCall();
    }

    static void mainMethodStaticCall() {

    }
}
