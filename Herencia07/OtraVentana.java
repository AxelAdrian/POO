package Herencia07;

public class OtraVentana extends Ventana {

    protected String titulo;

    public OtraVentana(String titulo, int posX, int posY, int ancho, int alto) {
        super(posX, posY, ancho, alto);
        this.titulo = titulo;
    }

    public void desplazaVentana(int cambioX, int cambioY) {
        posX += cambioX;
        posY += cambioY;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("***Titulo***\n" + this.titulo);
    }

}
