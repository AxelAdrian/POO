package Pack12;

public class Mujer {

    private String nombre;
    private int edad;

    public Mujer(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }

}
