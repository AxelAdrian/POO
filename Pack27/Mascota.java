package Pack27;

public class Mascota {

    private String nombre, raza;

    public Mascota(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public void cambiaNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiaRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota {" + "nombre: " + nombre + ", raza: " + raza + '}';
    }
}
