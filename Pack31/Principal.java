/*
Clases envoltorios (Wrappers)
 */
package Pack31;

public class Principal {

    public static void main(String[] args) {
        int a = 4;
        double b = 40.2435;
        char c = 'b';
        String c1 = "Hola, que tal! -";
        String c2 = new String("Me llamo Axel");
        System.out.println(c1.concat(c2));

        Entero e1 = new Entero(4);
        e1.dameValor();
        int num = 8;
        Integer ob1 = new Integer(num);//envuelve la variable num;
        System.out.println(ob1);
        double var = ob1.floatValue();//convertir a doble;
        System.out.println(var);

        int d = Integer.compare(4, 100);
        System.out.println(d);
        //-1 primero menor; 0 iguales; 1 segundo mayor;
    }

}
