package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        //다형적 참조 - 부모 타입은 자식타입을 담을 수 있음.
        //서로 다른 인스턴스를 부모타입 하나로 묶을 수 있다.
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }

    //선언된 변수 타입이 자식 타입이라도 부모 타입으로 매개변수로 받을 수 있다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //sound는 오버라이딩 된 메서드 -> 자식 메서드가 우선권.
        System.out.println("동물 소리 테스트 종료");
    }
}
