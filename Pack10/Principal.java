package Pack10;

public class Principal {
    
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.Acelerar(12);
        v1.Frenar(4);
        System.out.println(v1.getVelocidad());
        Vehiculo v2 = new Vehiculo();
        v2.Acelerar(40);
        v2.Frenar(10);
        System.out.println(v2.getVelocidad());
    }
    
}
