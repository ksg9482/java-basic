package poly.ex3;

import poly.ex2.Animal;

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
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal sound start");
        animal.sound();
        System.out.println("animal sound end");
    }
}
