package Pack6;

public class Coche {

    private String color;
    private double precio;
    private int antiguedad;

    //metodo constructor para poder inicializar los objetos
    //el constructor se tiene que llamar igual que la clase
    //inicializador de los objetos
    public Coche(String color, double precio, int antiguedad) {
        this.color = color;
        this.precio = precio;
        this.antiguedad = antiguedad;
    }

//metodos getter para devolver atributos
    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

}
