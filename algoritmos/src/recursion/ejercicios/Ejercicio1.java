package recursion.ejercicios;

public class Ejercicio1 {
    public static int largest(int[] numbers, int index) {
        if (index == 0) {
            return numbers[0];
        }
        return Math.max(numbers[index], largest(numbers, index-1));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 8, 67};
        int sol = largest(arr, arr.length - 1);
        System.out.println(sol);
    }
}
