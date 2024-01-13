package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);

        //왼쪽에 있는 인스턴스가 오른쪽에 있는 클래스를 가지는가.
        //new Parent() instanceof Parent; //true
        //new Child() instanceof Parent; //true
        //new Parent() instanceof Child; //false 부모인스턴스 밖에 없어서 자식 클래스가 없음
        //new Child() instanceof Child //true
    }

    private static void call(Parent parent) {
        //java16부터 정식으로 들어감. 인스턴스가 맞으니 바로 변수선언을 할 수 있음.
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }


}
