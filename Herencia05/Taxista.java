package Herencia05;

public class Taxista extends Persona {

    private String id;

    public Taxista(String nombre, String apellido, int edad, String id) {

        super(nombre, apellido, edad);
        this.id = id;
        System.out.println("***Constructor Taxista***");
        System.out.println("ID: " + this.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
