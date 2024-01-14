package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        //flyAnimal(dog); dog는 fly인터페이스가 없음
        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal sound start");
        animal.sound();
        System.out.println("animal sound end");
    }

    //Fly인터페이스 있으면 사용가능
    //AbstactAnimal, Fly 둘다 한 인스턴스에 들어가 있음. 그중 Fly에 매칭됨
    private static void flyAnimal(Fly fly) {
        System.out.println("새 날기");
        fly.fly();
    }
}
