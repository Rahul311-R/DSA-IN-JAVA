import java.util.Scanner;

public class large_in_arr {
    static int large(int n,int[] arr){
        int la = arr[0];
        for(int i = 1 ;i<n;i++){
            if(la<arr[i]){
                la = arr[i];
            }
        }
        return la;
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
        int lar = large(n,arr);
        System.out.println(lar);
    }
}
