import java.util.Arrays;

public class GameOfTwoStacks {
    // Hackerrank
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 4, 6, 1};
        int[] b = new int[]{2, 1, 8, 5};
        int maxSum = 10;
        int count = 0;
        int sum = 0;

        int ans = twoStacks(maxSum, a, b, sum, count)-1;
        System.out.println(ans);
    }

    private static int twoStacks(int maxSum, int[] a, int[] b, int sum, int count) {
        if(sum > maxSum){
            return count;
        }

        if(a.length==0 || b.length==0){
            return count;
        }

        int ans1 = twoStacks(maxSum, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2 = twoStacks(maxSum, a, Arrays.copyOfRange(b, 1, b.length), sum+b[0], count+1);

        return Math.max(ans1, ans2);
    }
}
