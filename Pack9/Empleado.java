package Pack9;

public class Empleado {

    private String nombre;
    private String legajo;
    private double sueldo;

    public Empleado(String nombre, String legajo, double sueldo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String toString() {
        return "Nombre: " + this.nombre + "\n" + "Legajo: " + this.legajo + "\n" + "Sueldo: " + this.sueldo + "\n";
    }

}
