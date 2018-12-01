package Pack3;

public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p1.dameNombre("amalia");
        p2.dameNombre("sonia");
        p3.dameNombre("juan");

        p1.dameApellido("lopez");
        p2.dameApellido("bentancurt");
        p3.dameApellido("sosa");

        p1.dameEdad(25);
        p2.dameEdad(30);
        p3.dameEdad(40);

        p1.dameGenero("Femenino");
        p2.dameGenero("Masculino");
        p3.dameGenero("Masculino");

        System.out.println("Datos p1: \nNombre: " + p1.devuelveNombre() + "\nApellido: " + p1.devuelveApellido() + "\nGenero: " + p1.devuelveGenero() + "\nEdad: " + p1.devuelveEdad() + "\n");
        System.out.println("Datos p2: \nNombre: " + p2.devuelveNombre() + "\nApellido: " + p2.devuelveApellido() + "\nGenero: " + p2.devuelveGenero() + "\nEdad: " + p2.devuelveEdad() + "\n");
        System.out.println("Datos p3: \nNombre: " + p3.devuelveNombre() + "\nApellido: " + p3.devuelveApellido() + "\nGenero: " + p3.devuelveGenero() + "\nEdad: " + p3.devuelveEdad() + "\n");
    }

}
