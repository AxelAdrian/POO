package Pack13;

public class Circulo {

    private double radio;
    private double diametro;

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = 2 * this.radio;
    }
//get=obtener; metodos que nos devuelven el valor de los atributos;

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

}
