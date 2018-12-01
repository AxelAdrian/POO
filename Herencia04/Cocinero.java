package Herencia04;

public class Cocinero extends Empleado {

    private String tipoCocina;

    public Cocinero(String nombre, double sueldo, String tipoCocina) {
        super(nombre, sueldo);
        this.tipoCocina = tipoCocina;
        System.out.println("Tipo de cocina: " + this.tipoCocina);
    }

}
