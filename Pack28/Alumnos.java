package Pack28;

public class Alumnos {

    private String nombre;
    private int edad;
    private String id;

    public Alumnos(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + "\nedad: " + edad + "\nid: " + id + "\n**************";
    }

}
