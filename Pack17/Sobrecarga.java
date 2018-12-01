package Pack17;

public class Sobrecarga {

    public void Operaciones() {
        System.out.println("No estas realizando ninguna operacion");
    }

    public void Operaciones(int num1, int num2) {
        System.out.println("metodo con 2 paramtetros int");
        System.out.println(num1 + num2);
    }

    public void Operaciones(double num1, double num2) {
        System.out.println("metodo con 2 paramtetros double");
        System.out.println(num1 + num2);
    }

    public void Operaciones(int num1, int num2, int num3) {
        System.out.println("metodo con 3 paramtetros int");
        System.out.println(num1 + num2 + num3);
    }
}
