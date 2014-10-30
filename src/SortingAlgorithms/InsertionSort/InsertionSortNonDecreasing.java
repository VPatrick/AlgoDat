package SortingAlgorithms.InsertionSort;

import SortingAlgorithms.Sort;

/**
 * Aufgabe InsertionSort
 * @author Patrick Vogt
 * @see SortingAlgorithms.Sort
 */
public class InsertionSortNonDecreasing extends Sort {

    /**
     * Sortiert eine Eingabesequenz nicht-absteigend
     * @param values Eingabesequenz
     * @return nicht-absteigend sortierte Ausgabesequenz
     */
    public int[] sort(int[] values) {
        for (int j = 1; j < values.length; j++) {
            int key = values[j];
            int i = j - 1;
            while (i >= 0 && values[i] > key) {
                values[i + 1] = values[i];
                i = i - 1;
            }
            values[i + 1] = key;
        }
        return values;
    }

}
