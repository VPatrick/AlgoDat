package SortingAlgorithms.MergeSort;

import SortingAlgorithms.Sort;

import java.util.Arrays;

/**
 * Aufgabe MergeSort
 * @author Patrick Vogt
 * @see SortingAlgorithms.Sort
 */
public class MergeSort extends Sort {

    private int[] numbers;
    private int[] helper;

    /**
     * Sortiert eine Eingabesequenz
     * @param values Eingabesequenz
     * @return sortierte Ausgabesequenz
     */
    public int[] sort(int[] values) {
        this.numbers = values;
        int number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
        return this.numbers;
    }

    /**
     * Sortiert mit Hilfe des MergeSort-Algorithmus
     * @param lindex Index ganz links der Eingabesequenz
     * @param rindex Index ganz rechts der Eingabesequenz
     */
    private void mergesort(int lindex, int rindex) {
        if (lindex < rindex) {
            int middle = lindex + (rindex - lindex) / 2;
            this.mergesort(lindex, middle);
            this.mergesort(middle + 1, rindex);
            this.merge(lindex, middle, rindex);
        }
    }

    /**
     *
     * @param lindex Index ganz links der Eingabesequenz
     * @param middle Mittlerer Index
     * @param rindex Index ganz rechts der Eingabesquenz
     */
    private void merge(int lindex, int middle, int rindex) {
        this.helper = Arrays.copyOf(this.numbers, this.numbers.length);

        int i = lindex;
        int j = middle + 1;
        int k = lindex;

        while (i <= middle && j <= rindex) {
            if (this.helper[i] <= this.helper[j]) {
                this.numbers[k] = this.helper[i];
                i++;
            } else {
                this.numbers[k] = this.helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            this.numbers[k] = this.helper[i];
            k++;
            i++;
        }
    }

}
