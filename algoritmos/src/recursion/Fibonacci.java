package recursion;

public class Fibonacci {
    /*
    Serie = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
    Fibo(0) = 0
    Fibo(1) = 1
    Fibo(2) = 1 : 0 + 1 : Fibo(0) + Fibo(1)
    Fibo(3) = 2 : 1 + 1 : Fibo(1) + Fibo(2)
    Fibo(n) = ? : Fibo(n-1) + Fibo(n-2)
     */

    public static long fibo(int n) {
        // Caso base
        if (n == 0 || n == 1) return n;

        // Caso recursivo
        return fibo(n-1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        long i = System.currentTimeMillis();
        System.out.println(fibo(47));
        long f = System.currentTimeMillis();
        System.out.println("Duracion: " + (f-i) + " ms");
    }
}
