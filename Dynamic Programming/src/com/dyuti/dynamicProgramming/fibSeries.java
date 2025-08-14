package com.dyuti.dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class fibSeries {

    public static int fib(int n){
        HashMap<Integer, Integer> memo = new HashMap<>();

        if(n==0||n==1){
            return n;
        }

        if(memo.containsKey(n)){
            return memo.get(n);
        }

        int result = fib(n-1)+fib(n-2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
