package Pack8;

public class Principal {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("axel", "2134", 8);
        Alumno a2 = new Alumno("vicky", "3214", 8.5);
        Alumno a3 = new Alumno("jose", "8764", 6.5);

        System.out.println("Datos:");
        System.out.println(a1.getNombre() + "; " + a1.getNumeroControl() + "; " + a1.getPromedio());
        System.out.println("\nDatos:");
        System.out.println(a2.getNombre() + "; " + a2.getNumeroControl() + "; " + a2.getPromedio());
        System.out.println("\nDatos:");
        System.out.println(a3.getNombre() + "; " + a3.getNumeroControl() + "; " + a3.getPromedio());
    }

}
