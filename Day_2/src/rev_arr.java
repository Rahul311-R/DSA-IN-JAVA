import java.util.Scanner;

public class rev_arr {
    static int[] rev(int n,int[] arr){
        int st = 0,en = n-1;
        while(st<en){
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;

        }
        return arr;
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
        int[] res = rev(n,arr);
        for(int a : res){
            System.out.print(a+" ");
        }
    }
}
