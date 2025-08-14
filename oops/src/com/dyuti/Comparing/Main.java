package com.dyuti.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student Kunal = new Student(12, 89.25f);
        Student Rahul = new Student(10, 99.35f);
        Student Arpita = new Student(13, 87.65f);
        Student Jeet = new Student(5, 85.25f);
        Student Deepa = new Student(1, 88.34f);
        Student Deva = new Student(3, 75.52f);

        Student[] list = {Kunal, Rahul, Arpita, Jeet, Deepa, Deva};
//        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));

//        if(Kunal.compareTo(Rahul) < 0){
//            System.out.println("Rahul has more marks than KUnal");
//            System.out.println(Kunal.compareTo(Rahul));
//        }
        Arrays.sort(list, new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return Float.compare(o1.marks, o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));

    }
}
