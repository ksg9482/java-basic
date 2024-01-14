package poly.ex5;

public class ImterfaceAnimalMain {
    public static void main(String[] args) {
        //인터페이스는 인스턴스 생성 불가

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

    }


    private static void soundAnimal(InterfaceAnmial animal) {
        System.out.println("animal sound start");
        animal.sound();
        System.out.println("animal sound end");
    }

    private static void moveAnimal(InterfaceAnmial animal) {
        System.out.println("animal move start");
        animal.move();
        System.out.println("animal move end");
    }

}
