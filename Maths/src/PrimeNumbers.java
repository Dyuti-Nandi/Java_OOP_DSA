public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 40;
//        System.out.println(isPrime(n));
        // print numbers prime till n
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
//        int i = 2;
//        while(i*i<=n){
//            if(n%i == 0){
//                return false;
//            }
//            i++;
//        }
//        return true;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
