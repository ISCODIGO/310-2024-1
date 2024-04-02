package recursion.colas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ACQueue<Integer> cola = new ACQueue<>(5);
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.dequeue();
        cola.dequeue();
        cola.dequeue();
        cola.enqueue(40);
        cola.enqueue(50);
        cola.enqueue(60);
        cola.enqueue(70);
        cola.enqueue(80);
        cola.enqueue(90);
        cola.print();
    }
}
