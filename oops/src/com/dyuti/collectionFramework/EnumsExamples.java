package com.dyuti.collectionFramework;

public class EnumsExamples{

    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants
        // public, static & final
        // Since it's final we cannot create child enums
        // type is week

        void display(){
            System.out.println("Hi");
        }

        Week(){
            System.out.println("Constructor called for"+this);
        }

        @Override
        public void hello() {
            System.out.println("Hi this is enum");
        }
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Tuesday;
//        System.out.println(Week.Friday);
        week.display();
//        for(Week day: Week.values()){
//            System.out.println(day);
//        }
        System.out.println(week.ordinal());
        System.out.println(Week.valueOf("Sunday"));
        week.hello();
    }
}
