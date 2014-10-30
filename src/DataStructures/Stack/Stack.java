package DataStructures.Stack;

import java.util.NoSuchElementException;

/**
 * Aufgabe 10.2-2
 * Implementierung eines Stack mit Hilfe einer einfach verketteten Liste
 * @author Patrick Vogt
 * @see IStack
 */
public class Stack<T> implements IStack<T> {

    private int total;

    private Node first;

    private class Node {
        private T element;
        private Node next;
    }

    public Stack() {}

    /**
     * Legt ein Element auf dem Stack ab
     * @param element Element
     * @return Referenz auf den Stack
     */
    public Stack<T> push(T element) {
        Node current = first;
        this.first = new Node();
        this.first.element = element;
        this.first.next = current;
        this.total++;
        return this;
    }

    /**
     * Liefert das oberste Element des Stacks
     * @return oberstes Stack-Element
     */
    public T pop() {
        if (this.first == null) throw new NoSuchElementException("Stack ist leer!");
        T element = this.first.element;
        this.first = this.first.next;
        this.total--;
        return element;
    }

    /**
     * Liefert die Größe des Stacks
     * @return Stackgröße
     */
    public int getListLength() {
        return this.total;
    }

    /**
     * @return Durch Kommas getrennte Elemente des Stacks
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node tmp = this.first;
        while (tmp != null) {
            sb.append(tmp.element).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}