import java.util.*;

public class leetcode_268 {
    static int mis(int n, int[] arr){
        int sum = 0;
        int exp = n * (n+1) /2;
        for(int a: arr){
            sum += a;
        }
        int mis  = exp - sum;
        return mis;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(mis(n,arr));
    }
}
