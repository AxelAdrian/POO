package Pack18;

public class Estudiante {

    private String nombre;
    private int edad;

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad incorrecta");
        }
    }
}
