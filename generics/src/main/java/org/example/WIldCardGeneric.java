package org.example;

import java.util.Arrays;
import java.util.List;

public class WIldCardGeneric<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WIldCardGeneric() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList1(List<Number> list) {
        // do something

        // Here you can only pass Number
    }

   public void getList2(List<? extends Number> list) {
        // do something

        // Here you can also pass sub-classes of Number
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WIldCardGeneric<Integer> list = new WIldCardGeneric<>();

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);

    }

}