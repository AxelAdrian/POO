package Pack8;

public class Alumno {

    private String nombre;
    private String numeroControl;
    private double promedio;

    public Alumno(String nombre, String numeroControl, double promedio) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public double getPromedio() {
        return promedio;
    }

}
