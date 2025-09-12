import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leetcode_49 {

    static void grpanagram(String[] arr){
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = s.nextLine();
        }
        grpanagram(arr);
        for(String a : arr){
            System.out.print(a+" ");
        }
    }
}