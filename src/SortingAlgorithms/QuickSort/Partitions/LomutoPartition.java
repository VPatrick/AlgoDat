package SortingAlgorithms.QuickSort.Partitions;

/**
 * Implementierung der Lomuto-Partition
 * @author Patrick Vogt
 * @see SortingAlgorithms.QuickSort.Partitions.AbstractPartition
 */
public class LomutoPartition extends AbstractPartition {

    /**
     * Implementierung der Lomuto-Partition
     * @param A Array
     * @param p p
     * @param r r
     * @return q
     */
    public int partition(int A[], int p, int r) {
        int x = A[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (A[j] <= x) {
                i++;
                this.swap(A, i, j);
            }
        }
        this.swap(A, i + 1, r);
        return i + 1;
    }

}