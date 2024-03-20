package recursion.colas;

public interface Queue<T> {
    // Agregar
    public boolean enqueue(T it);

    // Eliminar
    public T dequeue();

    public void clear();

    public int size();

    public boolean isEmpty();
}
