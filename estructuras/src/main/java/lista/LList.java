package lista;

import java.util.NoSuchElementException;

public class LList<E> implements List<E> {
    class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E it) {
            this.data = it;
            this.next = null;
        }
    }

    private Node<E> head;  // referencia al primer nodo
    private Node<E> tail;  // referencia al ultimo nodo
    private int size;
    private Node<E> curr;  // puntero al nodo actual

    public LList() {
        clear();
    }

    @Override
    public void clear() {
        head = tail = curr = null;
        size = 0;
    }

    private Node<E> firstNode(E it) {
        var nuevo = new Node<>(it);
        head = nuevo;
        tail = nuevo;
        return nuevo;
    }

    @Override
    public boolean insert(E it) {
        if (isEmpty()) {
            firstNode(it);
        } else if (curr == tail) {
            return append(it);
        } else {
            var nuevo = new Node<>(it);
            nuevo.next = curr;
            prev();
            curr.next = nuevo;
        }

        size++;
        return true;
    }

    @Override
    public boolean append(E it) {
        if (isEmpty()) {
            firstNode(it);
        } else {
            var nuevo = new Node<>(it);
            tail.next = nuevo;
            tail = nuevo;
        }
        size++;
        return true;
    }

    @Override
    public E remove() throws NoSuchElementException {
        E dato;

        // Eliminar si hay un solo nodo
        if (size == 1) {
            dato = head.data;
            clear();
        }
        // Eliminar el primer nodo
        else if (curr == head) {
            dato = head.data;
            head = head.next;
            size--;
        }
        // Eliminar del segundo al ultimo
        else {
            dato = curr.data;
            // se cambia el curr al previo
            prev();

            // Si el eliminado era el ultimo tail ahora es el penultimo
            if (curr.next == tail) {
                tail = curr;
            }

            // Aqui ocurre la perdida de la referencia
            curr.next = curr.next.next;



            size--;
        }


        return dato;
    }

    @Override
    public void moveToStart() {
        curr = head;
    }

    @Override
    public void moveToEnd() {
        curr = tail;
    }

    @Override
    public void prev() {
        var temp = head;

        while(temp.next != curr) {
            temp = temp.next;
        }

        curr = temp;
    }

    @Override
    public void next() {
        curr = curr.next;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public int currPos() {
        var temp = head;
        int pos = 0;

        while(temp != curr) {
            temp = temp.next;
            pos++;
        }

        return pos;
    }

    @Override
    public boolean moveToPos(int pos) {
        if (pos < 0 || pos > size) {
            return false;
        }

        var temp = head;
        int index = 0;

        while(index < pos) {
            temp = temp.next;
            index++;
        }

        curr = temp;
        return true;
    }

    @Override
    public boolean isAtEnd() {
        return curr == tail;
    }

    @Override
    public E getValue() throws NoSuchElementException {
        if (curr != null) {
            return curr.data;
        }

        throw new NoSuchElementException();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        LList<Integer> lista = new LList<>();
        lista.append(10);

        System.out.println(lista.size == 1);
        System.out.println(lista.head.data == 10);
        System.out.println(lista.tail.data == 10);

        lista.append(20);

        System.out.println(lista.size == 2);
        System.out.println(lista.head.data == 10);
        System.out.println(lista.tail.data == 20);

        lista.append(30);
        lista.moveToEnd();
        lista.remove();

        System.out.println(lista.size == 2);
        System.out.println(lista.head.data == 10);
        System.out.println(lista.tail.data == 20);
        System.out.println(lista.tail.data);

        lista.moveToStart();
        lista.insert(40);
        System.out.println(lista.size == 3);
        System.out.println(lista.head.data == 40);
        System.out.println(lista.head.next.data == 10);

        lista.clear();

        lista.insert(50);
        lista.moveToStart();

        System.out.println(lista.size == 1);
        System.out.println(lista.head.data == 50);
        System.out.println(lista.tail.data == 50);
    }
}


/*


[10] -> [20] -> [30]
                  x





 */