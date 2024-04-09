package pila;

import java.util.NoSuchElementException;

public class AStack<E> implements Stack<E> {
    private E[] array;
    private int size;
    private int current;

    public AStack(int capacity) {
        array = (E[]) new Object[capacity];
        this.clear();
    }

    @Override
    public boolean push(E it) {
        if (size >= array.length) {
            return false;
        }

        array[++current] = it;
        size++;
        return true;
    }

    @Override
    public E pop() {
        E prev = this.top();
        current--;
        size--;
        return prev;
    }

    @Override
    public E top() {
        if (this.isEmpty())
            throw new NoSuchElementException("Pila vacia");
        return array[current];
    }

    @Override
    public void clear() {
        this.current = -1;
        this.size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return length() == 0;
    }


}
