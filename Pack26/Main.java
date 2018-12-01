package Pack26;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int ar[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int n;
        Arrays.fill(ar,100); //Llenar arrays
        System.out.println("ingrese valores");
        for (int i = 0; i < ar.length; i++) {
            n = sc.nextInt();
            ar[i] = n;
        }
        Arrays.sort(ar);
        System.out.println("Arreglo ordenado:\n" + Arrays.toString(ar));
    }

}
