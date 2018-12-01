package Pack20;

public class Principal {

    public static void main(String[] args) {
        Aviones a1 = new Aviones("Marca X", 200);
        Aviones a2 = new Aviones("Marca Y", 300);
        Aviones a3 = new Aviones("Marca J", 400);
        a1.setContador(100);
        a2.setContador(1000);
        a3.setContador(50);
        System.out.println("El numero de aviones es: " + a1.getContador());

    }

}
