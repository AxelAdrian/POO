package Pack2;

public class Principal {

    public static void main(String[] args) {
        //crear instancias de clase (crear objetos)
        Coche c1 = new Coche();//primer objeto tipo coche
        Coche c2 = new Coche();//segundo objeto tipo coche
        Coche c3 = new Coche();//tercer objeto

        c1.color = "Rojo";
        c1.precio = 40000;
        c1.modelo = "RT632989WW";

        c2.color = "Azul";
        c2.precio = 50000;
        c2.modelo = "R45GT123";

        c3.color = "Amarillo";
        c3.precio = 30000;
        c3.modelo = "R123GTI456";

        System.out.println("Color: " + c1.color);
        System.out.println("Pecio: " + c1.precio);
        System.out.println("Modelo: " + c1.modelo);
    }

}
