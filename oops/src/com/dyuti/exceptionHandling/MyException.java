package com.dyuti.exceptionHandling;

public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        String name = "KK";

        try{
            if(name.equals("KK")){
                throw new MyException("name is KK");
               }
            } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
    }
    }
}
