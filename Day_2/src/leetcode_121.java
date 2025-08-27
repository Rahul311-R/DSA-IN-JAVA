import java.util.Scanner;

public class leetcode_121 {

    static int profit(int[] arr){
        int small = arr[0];
        int lar = 0;
        for(int i = 1;i<arr.length;i++){
            int pro = arr[i] - lar;
            if(lar < pro){
                lar = pro;
            }
            if(arr[i]<small){
                small = arr[i];
            }
        }
        return lar;
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
        System.out.println(profit(arr));
    }
}
