package Pack3;

public class Persona {

    //modificadores de acceso
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    //metodos de acceso setters y getters
    //                     requiere un nombre como parametro
    public void dameNombre(String nom) //setNombre
    {
        nombre = nom;
    }

    //getNombre
    public String devuelveNombre() //nos permite saber cual es ese nombre
    {
        return nombre;

    }

    public void dameApellido(String ape) {
        apellido = ape;
    }

    public String devuelveApellido() {
        return apellido;
    }

    public void dameGenero(String gen) {
        genero = gen;
    }

    public String devuelveGenero() {
        return genero;
    }

    public int devuelveEdad() {
        return edad;
    }

    public void dameEdad(int ed) {
        edad = ed;
    }

}
