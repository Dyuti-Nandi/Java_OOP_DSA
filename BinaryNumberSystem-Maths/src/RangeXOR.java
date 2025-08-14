public class RangeXOR {
    public static void main(String[] args) {
        int b = 9;
        int a = 3;

        // Range xor a till b = xor(b) ^ xor(a-1)
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        // This is only for check, will give TLE for large numbers
        int ans2 = 0;
        for(int i=a; i<=b; i++){
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    // This gives xor from 0 to a
    private static int xor(int n){
        if(n % 4 == 0){
            return n;
        }
        if(n % 4 == 1){
            return 1;
        }
        if(n % 4 == 2){
            return n+1;
        }
        return 0;
    }
}
