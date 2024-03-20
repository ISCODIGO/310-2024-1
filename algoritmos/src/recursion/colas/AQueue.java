/*
Es una cola implementada con un array.
 */

package recursion.colas;

public class AQueue<T> implements Queue<T> {
    T[] repositorio;
    int size;
    int frente;
    int fin;


    public AQueue(int capacity) {
        repositorio = (T[]) new Object[capacity];
        size = 0;
        fin = -1;
        frente = 0;
    }

    @Override
    public boolean enqueue(T it) {
        if (size == repositorio.length) return false;

        repositorio[++fin] = it;
        size++;
        return true;
    }

    @Override
    public T dequeue() {
        T temp = repositorio[frente++];
        size--;
        return temp;
    }

    @Override
    public void clear() {
        size = 0;
        fin = -1;
        frente = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return fin < frente;
    }
}

