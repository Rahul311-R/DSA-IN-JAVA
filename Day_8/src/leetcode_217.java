import java.util.HashSet;
import java.util.Scanner;

public class leetcode_217 {
    static boolean containduplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for(int i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }

        System.out.println(containduplicate(arr));
    }
}
