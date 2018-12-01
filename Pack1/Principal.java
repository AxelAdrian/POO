package Pack1;

public class Principal {

    public static void main(String[] args) {
//crear instancias de clase (objetos)
        Gato gato1 = new Gato();
        gato1.nombre = "Firulai";
        gato1.edad = 2;
        gato1.colorOjos = "Azules";
        gato1.peso = 2.2;

        Gato gato2 = new Gato();
        gato2.nombre = "Cuco";
        gato2.edad = 4;
        gato2.colorOjos = "Verde";
        gato2.peso = 3;

        Gato gato3 = new Gato();
        gato3.nombre = "Raul";
        gato3.edad = 2;
        gato3.colorOjos = "Verde";
        gato3.peso = 1.5;

        System.out.println("Objeto1");
        System.out.println("Nombre: " + gato1.nombre + "\n" + "edad: " + gato1.edad + "\n" + "Color de ojos: " + gato1.colorOjos + "\n" + "peso: " + gato1.peso + "\n");
        System.out.println("Objeto2");
        System.out.println("Nombre: " + gato2.nombre + "\n" + "edad: " + gato2.edad + "\n" + "Color de ojos: " + gato2.colorOjos + "\n" + "peso: " + gato2.peso + "\n");
        System.out.println("Objeto3");
        System.out.println("Nombre: " + gato3.nombre + "\n" + "edad: " + gato3.edad + "\n" + "Color de ojos: " + gato3.colorOjos + "\n" + "peso: " + gato3.peso + "\n");
    }

}
