public class Main {
    public static void main(String[] args) {
        /*AList<Integer> lista = new AList<>(10);
        lista.append(10);
        lista.append(20);
        lista.append(30);
        lista.moveToEnd();
        System.out.println(lista);*/


        // AStack (Stack usando un Array)
        // y el StackList(Stack usando un List) funcionan similar
        // debido a que implementan la interface Stack.
        Stack<Integer> pila = new StackList<>(10);

        pila.push(10);
        pila.push(20);
        pila.push(30);
        int x = pila.pop();

        System.out.println(pila.top() == 20);
        System.out.println(x == 30);

    }
}

