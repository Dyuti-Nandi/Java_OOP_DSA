public class ResetIthBit {
    public static void main(String[] args) {
        int num = 5;
        int n = 1;
        System.out.println(resetIthBit(num, n));
    }

    private static int resetIthBit(int num, int n) {
        int mask = 1 << (n-1);
        int maskComp = ~mask;
//        return num & mask; // Only doing this won't give 1 or 0, but it will give the integer number instead which is calculated as

        return num & mask;
    }
}
