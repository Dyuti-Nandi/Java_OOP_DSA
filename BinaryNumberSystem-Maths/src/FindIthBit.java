public class FindIthBit {
    public static void main(String[] args) {
        int num = 172;
        int n = 5;
        System.out.println(ithBit(num, n));
    }

    private static int ithBit(int num, int n) {
        int mask = 1 << (n-1);
//        return num & mask; // Only doing this won't give 1 or 0, but it will give the integer number instead which is calculated as
        int result = num & mask;

        return (result!=0) ? 1 : 0;
    }

}
