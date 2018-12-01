package Pack11;

public class Rectangulo {

    private double b;
    private double h;
    private double area;

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
        this.area = this.b * this.h;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public double getArea() {
        return area;
    }
}
