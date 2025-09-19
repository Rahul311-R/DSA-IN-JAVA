import java.util.HashSet;
import java.util.Scanner;

public class leetcode_219 {

    static boolean isduplicate1(int[] arr,int k){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++ ){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            if (set.size() > k) {
                set.remove(arr[i - k]);
        }

        }
        return false;
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
        System.out.print("enter the k value:");
        int k = s.nextInt();
        System.out.println(isduplicate1(arr,k));
    }
}
