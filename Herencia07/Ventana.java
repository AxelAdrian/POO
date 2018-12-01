package Herencia07;
//import javax.swing.JFrame;
//public class Ventana extends JFrame {
//
//    public Ventana() {
//                 //x, y, ancho, alto
//        setBounds(20, 20, 400, 600);
//        setVisible(true);
//    }

public class Ventana {

    protected int posX, posY, ancho, alto;

    public Ventana(int posX, int posY, int ancho, int alto) {
        this.posX = posX;
        this.posY = posY;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void mostrarInformacion() {
        System.out.println("Posicion X " + this.posX);
        System.out.println("Posicion Y " + this.posY);
        System.out.println("Ancho " + this.ancho);
        System.out.println("Alto " + this.alto);
    }

    public void modificarDimensiones(int cambioAncho, int cambioAlto) {
        System.out.println("***Dimensiones modificadas***");
        ancho += cambioAncho;
        alto += cambioAlto;
    }

}
