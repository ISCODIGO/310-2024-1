package recursion;

public class Fibonacci {
    /*
    <=
    Serie = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
    Fibo(0) = 0
    Fibo(1) = 1
    Fibo(2) = 1 : 0 + 1 : Fibo(0) + Fibo(1)
    Fibo(3) = 2 : 1 + 1 : Fibo(1) + Fibo(2)
    Fibo(n) = ? : Fibo(n-1) + Fibo(n-2)
     */

    public static int recursiones = 0;

    public static long fibo(int n) {
        // Caso base
        if (n == 0 || n == 1) {
            recursiones++;
            return n;
        }

        // Caso recursivo
        recursiones++;
        return fibo(n-1) + fibo(n - 2);
    }

    public static long fibo2(int n, long[] memoria) {
        if (memoria == null) {
            memoria = new long[n + 1];
            memoria[0] = 0;
            memoria[1] = 1;
        }

        // Caso base
        if ((n == 0) || (n > 0 && memoria[n] > 0)) {
            recursiones++;
            return memoria[n];
        }

        // Caso recursivo
        recursiones ++;
        memoria[n] = fibo2(n-1, memoria) + fibo2(n-2, memoria);
        return memoria[n];
    }

    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        System.out.println(fibo(47));
        long f = System.currentTimeMillis();
        System.out.println("Duracion: " + (f-i) + " ms");
        System.out.println("Recursiones: " + recursiones);

        recursiones = 0;
        long i2 = System.currentTimeMillis();
        System.out.println(fibo2(47, null));
        long f2 = System.currentTimeMillis();
        System.out.println("Duracion: " + (f2-i2) + " ms");
        System.out.println("Recursiones: " + recursiones);

    }
}
