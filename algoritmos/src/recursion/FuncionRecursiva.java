/*

Caso recursivo -> Caso base

 */

package recursion;

public class FuncionRecursiva {
    public static void conteoDigitos(int contador, int limite) {
        System.out.println(contador);

        // Caso base
        if (contador >= limite)
            return;

        // Caso recursivo
        conteoDigitos(++contador, limite);
    }

    public static int suma(int n) {
        if (n == 1) return  1;
        else return n + suma(n-1);
    }

    public static void main(String[] args) {
        //conteoDigitos(0, 10);
        System.out.println(suma(100));
    }
}
