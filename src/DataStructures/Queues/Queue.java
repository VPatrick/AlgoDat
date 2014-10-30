package DataStructures.Queues;

import java.util.NoSuchElementException;

/**
 * Aufgabe 10.2-3
 * Implementierung einer Queue (Warteschlange) mit Hilfe einer einfach verketteten Liste
 * @author Patrick Vogt
 * @see IQueue
 */
public class Queue<T> implements IQueue<T> {

    private int total;

    private Node first, last;

    private class Node {
        private T element;
        private Node next;
    }

    public Queue() {}

    /**
     * Fügt ein Element der Queue hinzu
     * @param element Element
     * @return Referenz auf die Queue
     */
    public Queue<T> enqueue(T element) {
        Node current = this.last;
        this.last = new Node();
        this.last.element = element;

        if (this.total++ == 0) this.first = this.last;
        else current.next = this.last;

        return this;
    }

    /**
     * Entnimmt ein Element der Queue
     * @return Element
     */
    public T dequeue() {
        if (this.total == 0) throw new NoSuchElementException("Queue ist leer!");
        T element = this.first.element;
        this.first = this.first.next;
        if (--this.total == 0) this.last = null;
        return element;
    }

    /**
     * Liefert die Länge der Queue
     * @return Länge der Queue
     */
    public int getQueueLength() {
        return this.total;
    }

    /**
     * @return Komma getrennte Elemente der Queue
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