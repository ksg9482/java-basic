package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod " + publicField);
    }
    void defaultMethod() {
        System.out.println("defaultMethod " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod " + privateField);
    }
    
    public void innerAccess() {
        //전부 접근 가능
        System.out.println("inner calling");
        publicField = 100;
        defaultField = 100;
        privateField = 100;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
