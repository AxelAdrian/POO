package Pack23;
//clase JFrame

import javax.swing.*;

public class Ventanas extends JFrame {

//constructor
    public Ventanas() {
        super("Mostrando mi ventana");
        setSize(450, 350);
        setLocation(100, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }
}
