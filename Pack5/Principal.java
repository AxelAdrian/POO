package Pack5;

public class Principal {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();

        e1.setNombre("Luis");
        e1.setLegajo("123456");
        e1.setSueldo(20000);

        e2.setNombre("Carlos");
        e2.setLegajo("654321");
        e2.setSueldo(18000);

        System.out.println("Datos empleado:");
        System.out.println(e1.getNombre() + "; Legajo: " + e1.getLegajo() + "; Sueldo: " + e1.getSueldo());
        System.out.println("\nDatos empleado:");
        System.out.println(e2.getNombre() + "; Legajo: " + e2.getLegajo() + "; Sueldo: " + e2.getSueldo());

    }

}
