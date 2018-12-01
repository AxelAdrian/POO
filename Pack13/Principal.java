package Pack13;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(4);
        Circulo c2 = new Circulo(2);
        Circulo c3; //variable de tipo circulo
        
        JOptionPane.showMessageDialog(null, "Circulo1\nRadio: "+c1.getRadio()+"\nDiametro: "+c1.getDiametro());
    }

}
