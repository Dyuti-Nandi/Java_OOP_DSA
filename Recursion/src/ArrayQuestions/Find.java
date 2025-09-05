package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int target = 4;
        System.out.println(find(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(findIndexFromLast(arr, target, arr.length-1));
        findAllIndex(arr, target, 0);
        System.out.println(list);
//        ArrayList <Integer> list = new ArrayList<>();
//        System.out.println(findMulIndex(arr, target, 0, list));
//        System.out.println(findMulIndex(arr, target, 0, new ArrayList<>()));
        ArrayList<Integer> ans = findMulIndex(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    public static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target) || find(arr, target, index+1);
    }

    public static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }

        return findIndex(arr, target, index+1);
    }

    public static int findIndexFromLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }

        return findIndexFromLast(arr, target, index-1);
    }

    static List<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }

        findAllIndex(arr, target, index+1);
    }

    public static ArrayList<Integer> findMulIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return findMulIndex(arr, target, index+1, list);
    }
}
