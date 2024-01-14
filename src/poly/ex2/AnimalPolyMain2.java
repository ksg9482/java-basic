package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        //다형적 참조 - 부모 타입은 자식타입을 담을 수 있음.
        //서로 다른 인스턴스를 부모타입 하나로 묶을 수 있다.
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {
            System.out.println("animal sound start");
            animal.sound();
            System.out.println("animal sound end");
        }
    }
}
