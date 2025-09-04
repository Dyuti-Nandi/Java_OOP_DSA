package ArrayQuestions;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean ans = sorted(arr, 0);

        if(ans){
            System.out.println("Sorted");;
        }else{
            System.out.println("Not sorted");
        }
    }

    public static boolean sorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        return (arr[i] < arr[i+1]) && sorted(arr, i+1);
    }
}
