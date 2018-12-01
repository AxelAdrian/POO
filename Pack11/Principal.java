package Pack11;

import javax.swing.JOptionPane;

public class Principal {
    //instanciar es -> crear objetos
    //r1 es variable de referencia
    //el operador new es el que crea objetos

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 2);
        JOptionPane.showMessageDialog(null, "La base es: " + r1.getB());
        JOptionPane.showMessageDialog(null, "La altura es: " + r1.getH());
        JOptionPane.showMessageDialog(null, "El area es: " + r1.getArea());
    }

}
