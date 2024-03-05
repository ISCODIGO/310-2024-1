/*

Estructura de datos de Pila utilizando una List (propio) y
una Stack (propio).
 */

public class StackList<E> implements Stack<E> {
    private List<E> repo;

    public StackList(int capacity) {
        repo = new AList<>(capacity);
    }


    @Override
    public boolean push(E it) {
        return repo.append(it);
    }

    @Override
    public E pop() {
        repo.moveToEnd();
        return repo.remove();
    }

    @Override
    public E top() {
        repo.moveToEnd();
        return repo.getValue();
    }

    @Override
    public void clear() {
        repo.clear();
    }

    @Override
    public int length() {
        return repo.length();
    }

    @Override
    public boolean isEmpty() {
        return repo.isEmpty();
    }
}
