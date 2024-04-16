package org.example.demogui.lista;

import java.util.NoSuchElementException;

// Array-based list implementation
public class AList<E> implements List<E> {
    private E listArray[];                  // Array holding list elements
    private static final int DEFAULT_SIZE = 10; // Default size
    private int maxSize;                    // Maximum size of list
    private int listSize;                   // Current # of list items
    private int curr;                       // Position of current element

    // Constructors
    // Create a new list object with maximum size "size"
    @SuppressWarnings("unchecked") // Generic array allocation
    public AList(int size) {
        maxSize = size;
        listSize = curr = 0;
        listArray = (E[])new Object[size];         // Create listArray
    }
    // Create a list with the default capacity
    AList() {
        this(DEFAULT_SIZE);                   // Just call the other constructor
    }

    public void clear() {                    // Reinitialize the list
        listSize = curr = 0;               // Simply reinitialize values
    }

    // Insert "it" at current position
    public boolean insert(E it) {
        if (listSize >= maxSize) {
            return false;
        }
        for (int i=listSize; i>curr; i--) {  // Shift elements up
            listArray[i] = listArray[i-1];   //   to make room
        }
        listArray[curr] = it;
        listSize++;                        // Increment list size
        return true;
    }

    // Append "it" to list
    public boolean append(E it) {
        if (listSize >= maxSize) {
            return false;
        }
        listArray[listSize++] = it;
        return true;
    }

    // Remove and return the current element
    public E remove() throws NoSuchElementException {
        if ((curr<0) || (curr>=listSize)) {  // No current element
            throw new NoSuchElementException("remove() in lista.AList has current of " + curr + " and size of "
                    + listSize + " that is not a a valid element");
        }
        E it = listArray[curr];            // Copy the element
        for(int i=curr; i<listSize-1; i++) {// Shift them down
            listArray[i] = listArray[i+1];
        }
        listSize--;                        // Decrement size
        return it;
    }

    public void moveToStart() {      // Set to front
        curr = 0;
    }
    public void moveToEnd() {  // Set at end
        curr = listSize - 1;
    }
    public void prev() {  // Move left
        if (curr != 0) {
            curr--;
        }
    }
    public void next() {  // Move right
        if (curr < listSize) {
            curr++;
        }
    }
    public int length() {       // Return list size
        return listSize;
    }
    public int currPos() {          // Return current position
        return curr;
    }

    // Set current list position to "pos"
    public boolean moveToPos(int pos) {
        if ((pos < 0) || (pos > listSize)) {
            return false;
        }
        curr = pos;
        return true;
    }

    // Return true if current position is at end of the list
    public boolean isAtEnd() {
        return curr == listSize;
    }

    // Return the current element
    public E getValue() throws NoSuchElementException {
        if ((curr < 0) || (curr >= listSize)) {// No current element
            throw new NoSuchElementException("getvalue() in lista.AList has current of " + curr + " and size of "
                    + listSize + " that is not a a valid element");
        }
        return listArray[curr];
    }

    //Tell if the list is empty or not
    public boolean isEmpty() {
        return listSize == 0;
    }

    @Override
    public String toString() {
        // <10, 20, |30>

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < listSize; i++) {
            if (i == curr) {
                sb.append("|");
            }

            sb.append(listArray[i]);

            if (i < listSize - 1) {
                sb.append(",");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}