package DataStructures.Queues;

/**
 * Interface zur Implementierung einer Queue auf Basis einer einfach verketteten Liste
 * @author Patrick Vogt
 * @param <T>
 */
public interface IQueue<T> {

    /**
     * Fügt ein Element der Queue hinzu
     * @param element Element
     * @return Referenz auf die Queue
     */
    Queue<T> enqueue(T element);

    /**
     * Entnimmt ein Element der Queue
     * @return Element
     */
    T dequeue();

}