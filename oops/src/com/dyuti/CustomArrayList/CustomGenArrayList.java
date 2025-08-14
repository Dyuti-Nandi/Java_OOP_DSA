package com.dyuti.CustomArrayList;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size;

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }


    public int size(){
        return size;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    public T remove() {
        return (T)(data[size--]);
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public void set(int val, int index) {
        data[index] = val;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

        for(int i=0; i<14; i++){
            list.add(i*2);
        }

        System.out.println(list);

//        CustomArrayList list = new CustomArrayList();
//        list.add(6);
//        list.add(2);
//        System.out.println(list.remove());
//        System.out.println(list.get(2));
//        System.out.println(list);
    }
}
