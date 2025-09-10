import java.util.Scanner;

public class MergeSort {

    static void merge(int[] arr, int i, int i1) {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }

        merge(arr,0,n-1);

        for(int a : arr){
            System.out.print(a+" ");
        }
    }


}
