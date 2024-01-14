package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        //추상적인 animal이 부모. 추상에 구현체가 의존함. 구현체는 추가되어도 추상은 안변한다.
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }


    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("animal sound start");
        animal.sound();
        System.out.println("animal sound end");
    }
}
