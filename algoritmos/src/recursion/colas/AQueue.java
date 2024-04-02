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
        return size == 0;
    }
    
    public void print() {
        // Imprimir todos los elementos del repositorio
        // Indicar con > el frente
        // Indicar con + el final
        
        
        for(int i = 0; i < repositorio.length; i++) {
            if (i == frente) {
                System.out.print(">");
            }
            if (i == fin) {
                System.out.print("+");
            }

            System.out.print(repositorio[i] + " ");
        }
    }
}

