package Pack10;

public class Vehiculo {

    private int ruedas;
    private double velocidad = 0;
    private String nombre;

    //aumentar velocidad
    public void Acelerar(double cantidad) {
        velocidad += cantidad; //velocidad = velocidad + cantidad;
    }

    //disminuir velocidad
    public void Frenar(double cantidad) {
        velocidad -= cantidad;
    }

    //metodo get
    public double getVelocidad() {
        return velocidad;
    }
}
