package Pack29;
//For Each || For extendido

public class Main {

    public static void main(String[] args) {
        String nombres[] = {"Paty", "Viena", "Salchi", "Pan", "Queso"};
        System.out.println("***Ciclo normal***");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        System.out.println("\n***Ciclo for each***");
        for (String elemento : nombres) {
            System.out.println(elemento);
        }
    }

}
