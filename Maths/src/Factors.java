import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(20);
    }

    // Time Complexity: O(n)
    public static void factors1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // Time Complexity: O(sqrt(n))
    public static void factors2(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }

    // Time Complexity: O(sqrt(n)) Space Complexity: O(sqrt(n))
    public static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i+" ");
                list.add(n/i);
            }
        }
        for(int j=list.size()-1; j>=0; j--){
            System.out.print(list.get(j)+" ");
        }
    }
}
