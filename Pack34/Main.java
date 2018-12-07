/*
Casting de tipos de datos primitivos en Java (Casting implícito y casting explícito)
 */
package Pack34;

public class Main {

    public static void main(String[] args) {
        int a = 80;
        long b = a;

        int n = 1200;
        short x = (short) n;
        double p = 4.92;
        n = (int) p;
        System.out.println(n);
    }

}
