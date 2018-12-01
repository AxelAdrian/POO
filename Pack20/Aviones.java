package Pack20;

public class Aviones {

    private String marca;
    private int maxPasajeros;
    private static int contador = 0;

    public Aviones(String marca, int maxPasajeros) {
        this.marca = marca;
        this.maxPasajeros = maxPasajeros;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public  void setContador(int contador) {
        Aviones.contador = contador;
    }

}
