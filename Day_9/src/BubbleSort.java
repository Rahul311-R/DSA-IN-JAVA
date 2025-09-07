import java.util.Scanner;

public class BubbleSort {

    static int[] bubble(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n -i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        bubble(arr);

        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
