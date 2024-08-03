package org.example;

import java.util.ArrayList;

public class Heap<T extends  Comparable<T>> {

    public static void main(String[] args) {
        try{
            Heap<Integer> heap = new Heap();
            heap.insert(19);
            heap.insert(13);
            heap.insert(15);
            heap.insert(17);
            heap.insert(11);

            System.out.println(heap.list);
            System.out.println(heap.remove());
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    private final ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if (index == 0) {
            return;
        }
        int parentIndex = parent(index);
        if (list.get(index).compareTo(list.get(parentIndex)) < 0) {
            swap(parentIndex, index);
            upHeap(parentIndex);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Heap is empty");
        }
        T temp = list.getFirst();
        T last = list.removeLast();
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }

}
