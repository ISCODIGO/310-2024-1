package recursion.ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println(multiply(2, 3));
    }

    public static int multiply(int x, int y) {
        if (x == 1) {
            return y;
        } else {
            return multiply(x - 1, y) + y;
        }
    }
}


/*

(2, 3)



____________
2: 3 + 3
____________

 */