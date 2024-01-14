package poly.ex6;

//순수 추상 클래스는 아님.
public abstract class AbstractAnimal {
    public abstract void sound(); //추상을 목적

    //상속을 목적
    public void move() {
        System.out.println("동물이 이동");
    }
}
