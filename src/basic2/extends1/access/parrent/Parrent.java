package basic2.extends1.access.parrent;

public class Parrent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void  publicMethod(){
        System.out.println("부모.publicMethod()");
    }

    private void privateMethod(){
        System.out.println("부모.privateMethod()");
    }
    protected void protectedMethod(){
        System.out.println("부모.protectedMethod()");
    }

    void defaultMethod(){
        System.out.println("부모.defaultMethod()");
    }

    public void printParent() {
        System.out.println("==부모 메서드 안==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        // 부모 메서드 안에서 모두 접근 가능
        defaultMethod();
        privateMethod();
    }
}
