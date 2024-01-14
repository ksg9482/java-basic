package poly.ex6;

//AbstractAnimal을 상속, Fly를 구현
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");

    }
}
