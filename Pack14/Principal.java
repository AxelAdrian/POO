package Pack14;

public class Principal {
//garbage collector

    public static void main(String[] args) {
        ClaseX objeto1;
        objeto1 = new ClaseX(4, 2);
        objeto1 = new ClaseX(0, 1);
        objeto1 = new ClaseX(8, 9);
        ClaseX objeto2;
        objeto2 = new ClaseX(2, 0);
        System.out.println(objeto1.getX() + "-" + objeto1.getY());
    }

}
