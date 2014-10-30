package SortingAlgorithms.InsertionSort;

import SortingAlgorithms.Sort;

/**
 * Aufgabe InsertionSort
 * @author Patrick Vogt
 * @see SortingAlgorithms.Sort
 */
public class InsertionSortNonIncreasing extends Sort {

    /**
     * Sortiert eine Eingabesequenz nicht-aufsteigend
     * @param values Eingabesequenz
     * @return nicht-aufsteigend sortierte Ausgabesequenz
     */
    public int[] sort(int[] values) {
        for (int j = 1; j < values.length; j++) {
            int key = values[j];
            int i = j - 1;
            while (i >= 0 && values[i] < key) {
                values[i + 1] = values[i];
                i--;
            }
            values[i + 1] = key;
        }
        return values;
    }

}
