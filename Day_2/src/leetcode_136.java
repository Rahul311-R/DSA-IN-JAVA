import java.util.Scanner;

public class leetcode_136 {
    static int sin(int[] arr){
        int res = 0;
        for (int a : arr){
            res ^= a;
        }
        return res;
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
        System.out.println(sin(arr));
    }
}
