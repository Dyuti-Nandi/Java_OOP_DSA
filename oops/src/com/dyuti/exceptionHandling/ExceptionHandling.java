package com.dyuti.exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) throws MyException {
        int a = 5;
        int b = 0;

//        try {
//            divide(3, 0);
//            throw new Exception("just for fun");
//        } catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("normal exception");
//        } finally {
//            System.out.println("This block will always run");
//        }

    }

//    static int divide(int a, int b){
//        return a/b;
//    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
