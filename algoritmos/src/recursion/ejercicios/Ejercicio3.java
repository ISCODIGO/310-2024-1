package recursion.ejercicios;

public class Ejercicio3 {
    public static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return GCD(y, x % y);
        }
    }

    public static void main(String[] args) {
        System.out.println(GCD(100, 30));
    }
}

/*

GCD(12, 4) = 4
GCD(4, 0)


GCD (100, 30) = 10
GCD (30, 10)
GCD (10, 0) -------


 */