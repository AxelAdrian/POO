package Herencia01;

public class Principal {

    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        alu1.nombre = "Axel";
        alu1.edad = 27;
        alu1.comer();
        alu1.dormir();

        Empleado e1 = new Empleado();
        e1.nombre = "Vicky";
        e1.edad = 27;
        e1.comer();
        e1.dormir();
    }

}
