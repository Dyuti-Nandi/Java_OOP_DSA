package com.dyuti.Comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+"";
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(this.marks, o.marks);

    }
}
