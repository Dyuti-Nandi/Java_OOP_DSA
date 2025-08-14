import java.util.*;

public class MoveZeros {
    public static int[] moveZeros(int n, int[] arr) {
        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }
        while (pos < n) {
            arr[pos++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of packets: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("After moving zeros to the end");
        int[] result = moveZeros(n, arr);
        System.out.println(Arrays.toString(result));
    }
}
