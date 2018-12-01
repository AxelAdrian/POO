package Pack24;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {
        super("Titulo de la ventana");
        setSize(300, 300);//metodo de la clase window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metodo clase jframe
        Container miPanel = getContentPane();
        miPanel.setLayout(new FlowLayout());//como se van a repartir los botones
        JButton boton = new JButton("Soy un boton");
        miPanel.add(boton);
        JButton boton2 = new JButton("Dame click");
        miPanel.add(boton2);
        JButton boton3 = new JButton("Hola");
        miPanel.add(boton3);
        JLabel texto = new JLabel("Hola saluda Youtube");
        miPanel.add(texto);
        JTextField etiqueta = new JTextField(20);
        miPanel.add(etiqueta);
    }

}
