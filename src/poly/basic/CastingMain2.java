package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        //단 자식의 기능을 호출할수는 없다

        //다운캐스팅(부모타입 -> 자식타입)
        Child child = (Child) poly;
        child.childMethod();
        
        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        //(Child) poly.childMethod(); //캐스팅보다 메서드 호출이 우선순위가 높아서 안됨.
        ((Child) poly).childMethod(); //poly부터 캐스팅 진행.
        //1. 다운캐스팅을 통해 부모타입을 자식타입으로 변환 후 기능호출
        //2. 참조값을 읽은 다음 자식타입으로 다운캐스팅
    }
}
