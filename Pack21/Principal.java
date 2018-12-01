package Pack21;

//Clase ArrayList
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        //metodo add()
        lista.add("Flor");
        lista.add("Vicky");
        lista.add("Joaquin");
        lista.add("Axel");
        System.out.println("Elementos de mi lista " + lista.toString());

        //metodo remove()
        lista.remove(1);
        System.out.println("Elementos de mi lista sin Vicky" + lista.toString());

        //metodo size()
        System.out.println("Numeros de elementos de la lista " + lista.size());

        //metodo get()
        System.out.println("Elemento en el indice 0 " + lista.get(0));

        //metodo clear()
//        lista.clear();
        //metodo contains()
        if (lista.contains("Flor")) {
            System.out.println("El elemento se encuentra en la lista");
        } else {
            System.out.println("El elemento no se encuentra en la lista");
        }

        //metodo isEmpty()
        System.out.println("Esta vacia nuestra lista? " + lista.isEmpty());
        
        for (String mostrar:lista)
        {
            System.out.println("Elemento "+mostrar);
        }
    }

}
