package Pack6;

public class Principal {

    public static void main(String[] args) {
        Coche c1 = new Coche("Rojo", 100000, 5);
        Coche c2 = new Coche("Azul", 120000, 2);
        Coche c3 = new Coche("Negro", 200000, 0);

        System.out.println("datos coche: ");
        System.out.println(c1.getColor() + "; " + c1.getAntiguedad() + "; " + c1.getPrecio());
        System.out.println("\ndatos coche: ");
        System.out.println(c2.getColor() + "; " + c2.getAntiguedad() + "; " + c2.getPrecio());
        System.out.println("\ndatos coche: ");
        System.out.println(c3.getColor() + "; " + c3.getAntiguedad() + "; " + c3.getPrecio());

    }

}
