package SortingAlgorithms.HeapSort;

import SortingAlgorithms.Sort;

public class HeapSort extends Sort {

    public HeapSort() {}

    public int[] sort(int[] array) {
        this.buildHeap(array);
        for (int i = array.length - 1; i > 0; i--) {
            this.swap(array, i, 0);
            this.heapify(array, 0, i);
        }
        return array;
    }

    private void buildHeap(int[] array) {
        for (int i = (array.length / 2) - 1; i >= 0; i--)
            heapify(array, i, array.length);
    }

    private void heapify(int[] array, int i, int n) {
        while (i <= (n / 2) - 1) {
            int child = this.getLeft(i);
            if (child + 1 <= n - 1) {
                if (array[child] < array[child + 1])
                    child++;
            }

            if (array[i] < array[child]) {
                this.swap(array, i, child);
                i = child;
            } else break;
        }
    }

    private void swap(int[] array, int swap1, int swap2) {
        int temp = array[swap1];
        array[swap1] = array[swap2];
        array[swap2] = temp;
    }

    private int getLeft(int i) {
        return ((i + 1) * 2) - 1;
    }
}