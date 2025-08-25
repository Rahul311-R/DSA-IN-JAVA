import java.util.Scanner;

public class check_arr_sort {
    static String check_sort(int n,int[] arr){
        for(int i = 0 ; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return "No";
            }
        }
        return "Yes";
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
        String lar = check_sort(n,arr);
        System.out.println(lar);
    }
}
