package SortingAlgorithms.QuickSort.Partitions;

/**
 * @author Patrick Vogt
 * @see SortingAlgorithms.QuickSort.Partitions.IPartition
 */
public abstract class AbstractPartition implements IPartition {

    public abstract int partition(int[] A, int left, int right);

    /**
     * Vertauscht zwei Elemente in einem Array
     * @param A Array
     * @param index1 index1
     * @param index2 index2
     * @return Array
     */
    public int[] swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
        return A;
    }

}