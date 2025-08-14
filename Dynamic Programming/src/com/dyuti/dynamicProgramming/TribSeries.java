package com.dyuti.dynamicProgramming;

import java.util.HashMap;
import java.util.Scanner;

public class TribSeries {
    public static int trib(int n){
        HashMap<Integer, Integer> memo = new HashMap<>();

        if(n==0) return 0;
        if(n==1||n==2) return 1;

        if (memo.containsKey(n)){
            return memo.get(n);
        }
        int result = trib(n-1)+trib(n-2)+trib(n-3);
        memo.put(n, result);
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(trib(n));
    }
}
