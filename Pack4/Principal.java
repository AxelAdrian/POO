package Pack4;

public class Principal {

    public static void main(String[] args) {
        //instanciar
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();

        alumno1.setNombreCompleto("Axel Dojas");
        alumno1.setNumControl("1234");
        alumno1.setCalificacion(8);

        alumno2.setNombreCompleto("Joaquin Rojas");
        alumno2.setNumControl("4321");
        alumno2.setCalificacion(9);

        alumno3.setNombreCompleto("Vicky Mariba");
        alumno3.setNumControl("2222");
        alumno3.setCalificacion(7.5);

        alumno4.setNombreCompleto("Shishi Mariba");
        alumno4.setNumControl("2332");
        alumno4.setCalificacion(6.5);

        System.out.println("Datos alumno:");
        System.out.println(alumno1.getNombreCompleto() + "; " + alumno1.getNumControl() + "; " + alumno1.getCalificacion());
        System.out.println("\nDatos alumno:");
        System.out.println(alumno2.getNombreCompleto() + "; " + alumno2.getNumControl() + "; " + alumno2.getCalificacion());
        System.out.println("\nDatos alumno:");
        System.out.println(alumno3.getNombreCompleto() + "; " + alumno3.getNumControl() + "; " + alumno3.getCalificacion());
        System.out.println("\nDatos alumno:");
        System.out.println(alumno4.getNombreCompleto() + "; " + alumno4.getNumControl() + "; " + alumno4.getCalificacion());

    }

}
