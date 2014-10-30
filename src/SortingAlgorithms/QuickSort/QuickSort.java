package SortingAlgorithms.QuickSort;

import SortingAlgorithms.QuickSort.Partitions.IPartition;
import SortingAlgorithms.Sort;

/**
 * Implementierung von QuickSort mit austauschbaren Partitionen
 * @author Patrick Vogt
 * @see SortingAlgorithms.Sort
 */
public class QuickSort extends Sort {

    private IPartition partition;

    public QuickSort(IPartition partition) {
        this.partition = partition;
    }

    /**
     * Sortiert eine Eingabesequenz mittels Quicksort
     * @param values Eingabesequenz
     * @return Sortierte Eingabesequenz
     */
    public int[] sort(int[] values) {
        return this.quickSort(values, 0, values.length - 1);
    }

    /**
     * Sortiert eine Eingabesequenz mittels QuickSort
     * @param A Array
     * @param p p
     * @param r r
     * @return Sortiertes Eingabearray
     */
    private int[] quickSort(int[] A, int p, int r) {
        if (p < r) {
            int i = this.partition.partition(A, p, r);
            this.quickSort(A, p, i - 1);
            this.quickSort(A, i + 1, r);
        }
        return A;
    }

}