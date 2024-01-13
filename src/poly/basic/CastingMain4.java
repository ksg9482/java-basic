package poly.basic;
//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();//문제없음

        Parent parent2 = new Parent(); //자식 인스턴스는 생성되지 않았음. 그래도 억지로 사용하니 에러.
        Child child2 = (Child) parent2; //런타임오류 - classCastException
        child2.childMethod();//실행 불가
    }
}
//업캐스팅은 문제가 없음. 자식을 생성하면 부모 클래스까지 인스턴스에 존재한다.