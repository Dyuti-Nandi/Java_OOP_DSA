public class FindGcdLcm {
    public static void main(String[] args) {
        System.out.println(gcd(3, 7));
        System.out.println(lcm(3, 7));
    }

    static int gcd(int a, int b) {
//        while(b!=0){
//            int temp = b;
//            b = b%a;
//            a = temp;
//        }
//        return a;
//    }
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
