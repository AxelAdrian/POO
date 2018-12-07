/*
Dibujar rectángulo en java, desde cero (Clase Graphics)-Dándole tamaño y coordenadas.
 */
package Pack33;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        DibujoRectangulo dib = new DibujoRectangulo();
        JFrame ventana =new JFrame();
        ventana.add(dib);
        ventana.setSize(400, 400);
        ventana.setVisible(true);
    }

}
