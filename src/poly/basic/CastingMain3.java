package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //원래는 캐스팅이 붙는데 생략되는것. 그냥은 없다. 업캐스팅은 생략되서 안보이고 권장할 뿐.
        Parent parent2 = child; //업캐스팅 생략
        parent1.parentMethod();
        parent2.parentMethod();

    }
}
