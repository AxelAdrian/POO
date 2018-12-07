/*
Excepciones (Uso de los bloques try y catch)
 */
package Pack30;

public class Principal {

    public static void main(String[] args) {
        int[] miArreglo = new int[5];

        try {
            //System.out.println(miArreglo[-4]);
            int num = 0;
            int division = 100 / num;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Se intento acceder a un indice incorrecto del arreglo");
        } catch (ArithmeticException exception) {
            System.out.println("Error al intenar dividir el numero entre 0");
        }
    }

}
