import java.util.HashSet;
import java.util.Scanner;

public class leetcode_202 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(happynum(n));
    }
    static boolean happynum(int n){
        HashSet<Integer> set = new HashSet<>();
        while (n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = fun(n);
        }
        return true;
    }
    static int fun(int n){
        int sum = 0;
        while(n>0){
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }
        return sum;
    }
}
