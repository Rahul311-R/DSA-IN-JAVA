import java.util.Arrays;
import java.util.Scanner;

public class sec_large_arr {
    static int second(int n ,int[] arr){
        int count = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=arr[i+1]){
                count++;
                if(count==2){
                    return arr[i+1];
                }
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements in array:");
        int n = s.nextInt();
        System.out.print("enter the elements:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int lar = second(n,arr);
        System.out.println(lar);
    }
}
