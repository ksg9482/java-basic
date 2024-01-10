package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        System.out.println(constructInit.value);

        //final 필드 - field 초기화. 필드에 이미 할당되어서 재할당 못함. 인스턴스를 몇개 만들든 내용이 같다.
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
    }
}