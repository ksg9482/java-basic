package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); //deco는 멤버변수도 없고 그냥 메서드에서 인수 받아 처리만 함. 인스턴스 필요 없음
        //인스턴스를 만드는 이유는 멤버변수를 사용하려는 목적. 필요가 없음.

        System.out.println("brfore:" + s);
        System.out.println("after:" + deco);

    }
}
