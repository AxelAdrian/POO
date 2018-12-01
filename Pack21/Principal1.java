package Pack21;

import java.util.ArrayList;

public class Principal1 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        //metodo add()
        lista.add(1);
        lista.add(4);
        lista.add(5);
        lista.add(8);
        
        System.out.println(lista.toString());
        lista.remove(1);
        System.out.println(lista.toString());
    }

}
