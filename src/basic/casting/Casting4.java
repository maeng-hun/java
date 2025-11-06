package basic.casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3/2; // 1
        System.out.println(div1);

        double div2 =3/2; // int/int 해서 1나오고 double이니 1.0
        System.out.println(div2);

        double div3 =3.0/2; // double/int -> double/double 3.0/2.0이 된다.
        System.out.println(div3);

        double div4 =(double) 3/2; //3.0/2.0
        System.out.println(div4);
        /*
            int + long = long 자동형변환
            int + double = double 자동형변환
         */
    }
}
