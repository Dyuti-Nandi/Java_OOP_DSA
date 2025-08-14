public class SingleNumber {
    public static void main(String[] args) {
        int[] num = new int[]{1, 3, 2, 4, 1, 4, 3};

        System.out.println(singleNumber(num));
    }

    private static int singleNumber(int[] num) {
        int unique = 0;

        for(int n: num){
            unique^= n;
        }
        return unique;
    }
}
