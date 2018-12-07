/*
Clases envoltorios (Wrappers)
 */
package Pack32;

public class Main {

    public static void main(String[] args) {
//Clase Integer envuelve a int
//        int var = 100;
//        String cad = "Hola";
//        
//        char v = cad.charAt(0);
//        System.out.println(v);
        int a = 2;
        long b = 1;
        double c = 4.2345;
//        String v = String.valueOf(a);
//        String v2 = String.valueOf(b);
//        String v3 = String.valueOf(c);
//        System.out.println(v);
//        System.out.println(v2);
//        System.out.println(v3);
//        String s = v + v2 + v3;
//        System.out.println(s);

        System.out.println(a + b + c);
        String x = Integer.toString(a);
        String y = Long.toString(b);
        String g = Double.toString(c);
        System.out.println(x + y + g);
    }

}
