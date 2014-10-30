package SortingAlgorithms.QuickSort.Partitions;

/**
 * Interface zur Implementierung von Partition für QuickSort
 * @author Patrick Vogt
 */
public interface IPartition {

    public int partition(int x[], int left, int right);

    public int[] swap(int[] A, int index1, int index2);

}