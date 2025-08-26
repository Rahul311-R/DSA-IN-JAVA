
import java.util.*;

public class leetcode_189 {
    static void rev(int[] arr,int st,int en){
        while(st<en){
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
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
        System.out.print("Enter the reverse position in array: ");
        int k = s.nextInt();
        k= k%n;
        if (k == 0) return;
        rev(arr,0,n-1);
        rev(arr,0,k-1);
        rev(arr,k,n-1);

        System.out.println(Arrays.toString(arr));
        for(int a : arr){
            System.out.print(a+" ");
        }

    }
}
