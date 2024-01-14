package poly.ex4;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        //추상클래스 생성불가
        //AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal sound start");
        animal.sound();
        System.out.println("animal sound end");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("animal move start");
        animal.move();
        System.out.println("animal move end");
    }
}
