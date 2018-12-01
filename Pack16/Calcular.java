package Pack16;

public class Calcular {

    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n--; //fact = fact * n--;
        }
        return fact;
    }
}
