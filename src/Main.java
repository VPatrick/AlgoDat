import SortingAlgorithms.QuickSort.*;
import SortingAlgorithms.QuickSort.Partitions.HoarePartition;

public class Main {

    public static void main(String[] args) {

        int[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

        for (int k: (new QuickSort(new HoarePartition())).sort(array)) {
            System.out.print(k + " ");
        }
    }

}