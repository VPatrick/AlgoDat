package DataStructures.Stack;

/**
 * Interface zur Implementierung eines Stacks auf Basis einer einfach verketteten Liste
 * @author Patrick Vogt
 * @param <T>
 */
public interface IStack<T> {

    /**
     * Legt ein Element auf dem Stack ab
     * @param element Element
     * @return Referenz auf den Stack
     */
    Stack<T> push(T element);

    /**
     * Liefert das oberste Element des Stacks
     * @return oberstes Element des Stacks
     */
    T pop();

}