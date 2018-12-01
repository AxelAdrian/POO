package Pack18;

public class Principal {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        e1.setNombre("juan");
        e1.setEdad(28);
        Estudiante e2 = new Estudiante();
        e2.setNombre("joaquin");
        e2.setEdad(0);
        System.out.println("Nombre: " + e1.getNombre() + "\nEdad: " + e1.getEdad());
        System.out.println("Nombre: " + e2.getNombre() + "\nEdad: " + e2.getEdad());
    }

}
