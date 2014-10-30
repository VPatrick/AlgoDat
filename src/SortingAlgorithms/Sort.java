package SortingAlgorithms;

/**
 * Sortiert Eingabesequenzen
 * @author Patrick Vogt
 * @see ISort
 */
public abstract class Sort implements ISort {

    /**
     * Sortiert eine Eingabesequenz
     * @param values Eingabesequenz
     * @return Sortierte Ausgabesequenz
     */
    public abstract int[] sort(int[] values);

}