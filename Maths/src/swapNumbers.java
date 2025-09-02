import java.util.Scanner;

public class swapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("a: "+a+" b: "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+a+" b: "+b);
    }
}
