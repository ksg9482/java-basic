package poly.diamond;

public class Child implements InterfaceA, InterFaceB{

    @Override
    public void methodA() {
        System.out.println("methodA");
    }
    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("methodCommon");
    }
}
