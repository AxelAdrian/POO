package Herencia04;

public class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Sueldo: " + this.sueldo);
    }

}
