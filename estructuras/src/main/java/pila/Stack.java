package pila;/*
Definicion del ADT de pila.Stack del cual implementaran todas las
estructuras de datos denominadas pila.Stack o pila.

 */

public interface Stack<E> {
    public boolean push(E it);
    public E pop();
    public E top();
    public void clear();
    public int length();
    public boolean isEmpty();
}
