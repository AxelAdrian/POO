package Pack5;

public class Empleado {

    private String nombre;
    private String legajo;
    private double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            sueldo = 0;
        }
    }
}
