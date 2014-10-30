package SortingAlgorithms.QuickSort.Partitions;

/**
 * Implementierung der Hoare-Partition
 * @author Patrick Vogt
 * @see SortingAlgorithms.QuickSort.Partitions.AbstractPartition
 */
public class HoarePartition extends AbstractPartition {

    /**
     * Implementierung der Hoare-Partition
     * @param A Array
     * @param p p
     * @param r r
     * @return q
     */
    public int partition(int A[], int p, int r) {
        int x = A[p];
        int i = p - 1;
        int j = r + 1;

        while (true)
        {
            do {
                j--;
            } while (A[j] > x);

            do {
                i++;
            } while (A[i] < x);

            if  (i < j)
                this.swap(A, i, j);
            else
                return j;
        }
    }

}