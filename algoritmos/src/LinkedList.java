import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {
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

    public LinkedList() {
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
        // TODO
        return false;
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

        if (size == 1) {
            dato = head.data;
            clear();
        } else if (curr == head) {
            dato = head.data;
            head = head.next;
            size--;
        } else {
            // se cambia el curr al previo
            prev();
            dato = curr.next.data;
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
}


/*


Nodo = [ data | enlace ]





 */