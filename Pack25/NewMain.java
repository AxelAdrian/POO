package Pack25;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        int i, num, contador = 0;
        int arreglo[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese los numeros");
        for (i = 0; i < 10; i++) {
            num = sc.nextInt();
            arreglo[i] = num;
            if (num < 6) {
                break;
            }
            contador++;
        }
        System.out.println("Ha finalizado for con break;");
        System.out.println("Valores capturados");
        for (i = 0; i <= contador; i++) {
            if (arreglo[i] > 6) {
                System.out.println(arreglo[i]);
            }
        }
    }

}
