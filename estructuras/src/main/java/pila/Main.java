package pila;

public class Main {
    public static void main(String[] args) {
        // pila.AStack (pila.Stack usando un Array)
        // y el pila.StackList(pila.Stack usando un lista.List) funcionan similar
        // debido a que implementan la interface pila.Stack.
        Stack<Integer> pila = new StackList<>(10);

        pila.push(10);
        pila.push(20);
        pila.push(30);
        int x = pila.pop();

        System.out.println(pila.top() == 20);
        System.out.println(x == 30);
    }
}
