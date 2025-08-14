package com.dyuti.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
            private static int DEFAULT_SIZE = 10;
            private int size;

    public CustomArrayList() {
                this.data = new int[DEFAULT_SIZE];
            }

            public void add(int num){
                if(isFull()){
                    resize();
                }
                data[size++] = num;
            }

            private void resize() {
                int[] temp = new int[data.length * 2];

                System.arraycopy(data, 0, temp, 0, data.length);
                data = temp;
            }

            public int remove(){
                return data[size--];
            }

            public int get(int index){
                return data[index];
            }

            public void set(int val, int index){
                data[index] = val;
            }

            private boolean isFull() {
                return size == data.length;
            }

            @Override
            public String toString() {
                return "CustomArrayList{" +
                        "data=" + Arrays.toString(data) +
                        ", size=" + size +
                        '}';
            }

            public static void main(String[] args) {
                CustomArrayList list = new CustomArrayList();
                list.add(5);
                list.add(4);
                list.add(8);
                list.add(6);
                list.add(7);
                list.add(2);
                list.add(3);
                list.add(1);
                list.add(8);
                list.add(6);
                list.add(2);
                System.out.println(list.remove());
                System.out.println(list.get(2));
        System.out.println(list);
    }
}
