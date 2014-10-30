package DataStructures.Queues.DAryHeap;

import java.util.Arrays;

public class DAryHeap<ENTITY extends Comparable> {

    private final static int EXPAND_RATIO = 2;
    private final static double COLLAPSE_RATIO = 0.25;
    private Object[] array;
    private int d;
    private int size;
    private int initialSize;

    public DAryHeap(int initialSize, int d) {
        if (d < 2)
            throw new IllegalArgumentException("d muss mindestens 2 sein.");

        this.d = d;
        this.array = new Object[initialSize];
        this.initialSize = initialSize;
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public void insert(ENTITY i) {
        if (this.array.length == this.size)
            this.expand();

        this.size++;
        int index = this.size - 1;
        int parentIndex = this.getParentIndex(index);
        while (index != 0 && i.compareTo(this.array[parentIndex]) < 0) {
            this.array[index] = this.array[parentIndex];
            index = parentIndex;
            parentIndex = this.getParentIndex(index);
        }
        this.array[index] = i;
    }

    @SuppressWarnings("unchecked")
    public ENTITY returnTop() {
        if (this.size == 0)
            throw new IllegalStateException("Der Heap ist leer.");

        ENTITY temp = (ENTITY) this.array[0];
        this.array[0] = this.array[this.size - 1];
        this.size--;
        if (this.size < this.array.length * COLLAPSE_RATIO && this.array.length / EXPAND_RATIO > this.initialSize)
            this.collapse();

        this.repairTop(0);
        return temp;
    }

    public void merge(DAryHeap<ENTITY> heap) {
        Object[] newArray = new Object[this.array.length + heap.array.length];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        System.arraycopy(heap.array, 0, newArray, this.size, heap.size);
        this.size += heap.size;
        this.array = newArray;
        for (int i = newArray.length / this.d; i >= 0; i--)
            this.repairTop(i);
    }

    private int getParentIndex(int index) {
        return (index - 1) / this.d;
    }

    @SuppressWarnings("unchecked")
    private void repairTop(int topIndex) {
        Comparable temp = (Comparable) this.array[topIndex];
        int succ = this.findSuccessor(topIndex * this.d + 1, topIndex  * this.d + this.d);
        while (succ < this.size && temp.compareTo(this.array[succ]) > 0) {
            this.array[topIndex] = this.array[succ];
            topIndex = succ;
            succ = this.findSuccessor(succ * this.d + 1, succ * this.d + this.d);
        }
        this.array[topIndex] = temp;
    }

    @SuppressWarnings("unchecked")
    private int findSuccessor(int from, int to) {
        int succ = from;
        for (int i = from + 1; i <= to && i < this.size; i++) {
            if (((Comparable) this.array[succ]).compareTo((Comparable) this.array[i]) > 0)
                succ = i;
        }
        return succ;
    }

    private void expand() {
        this.array = Arrays.copyOf(this.array, this.array.length * EXPAND_RATIO);
    }

    private void collapse() {
        this.array = Arrays.copyOf(this.array, this.array.length / EXPAND_RATIO);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.size; i++)
            builder.append(this.array[i]).append(" ");

        return builder.toString();
    }

}