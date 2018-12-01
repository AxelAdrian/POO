package Pack22;

import javax.swing.JOptionPane;

public class Principal1 {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese un nombre");
//        String numero = JOptionPane.showInputDialog("Ingrese un numero");
//        Integer.parseInt(numero);
//JOptionPane.showMessageDialog(null, "El valor ingresado es: " + numero);
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        int suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "Resultado de la suma: " + suma);

    }

}
