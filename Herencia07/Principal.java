package Herencia07;

public class Principal {

    public static void main(String[] args) {
//        Ventana v1 = new Ventana(50, 50, 400, 400);
//        v1.mostrarInformacion();
//        v1.modificarDimensiones(100, -50);
//        v1.mostrarInformacion();
        OtraVentana ov1 = new OtraVentana("Titulo nueva ventana", 100, 50, 400, 450);
        ov1.mostrarInformacion();
        ov1.desplazaVentana(200, 200);
        ov1.mostrarInformacion();
    }

}
