package Pack7;

public class Persona {

    private String nombre;
    private int edad;
    private double peso;

//el constructor nos ayuda a inicializar el objeto;
    public Persona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

}
