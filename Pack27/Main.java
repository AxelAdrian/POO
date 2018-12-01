package Pack27;

public class Main {

    public static void main(String[] args) {
        Mascota m1 = new Mascota("Firus", "Chihuahua");
        m1.cambiaNombre("Pipus");
        m1.cambiaRaza("Beagle");
        System.out.println(m1.toString());
    }

}
