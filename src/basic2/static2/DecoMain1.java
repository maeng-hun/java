package basic2.static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String str = "hello java";
        DeciUtil1 util1 = new DeciUtil1();
        String deco = util1.deco(str);

        DeciUtil1 util2 = new DeciUtil1();
        String deco2 = util1.deco(str);

        System.out.println(str);
        System.out.println(deco2);
    }
}
