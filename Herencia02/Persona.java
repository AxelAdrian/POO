package Herencia02;

import javax.swing.JOptionPane;

public class Persona {

    private String nombre;
    private int edad;

    public void introduceDatos() {
        nombre = JOptionPane.showInputDialog("Introduce nombre");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce edad"));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre + "\ny su edad es: " + edad);
    }
}
