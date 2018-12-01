package Pack7;

public class Principal {

    public static void main(String[] args) {
        Persona persona1 = new Persona("axel", 27, 65.1);
        Persona persona2 = new Persona("juan", 40, 73.3);

        System.out.println("***Datos de la persona***");
        System.out.println(persona1.getNombre() + "; " + persona1.getEdad() + "; " + persona1.getPeso());
        System.out.println("\n***Datos de la persona***");
        System.out.println(persona2.getNombre() + "; " + persona2.getEdad() + "; " + persona2.getPeso());
    }

}
