import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class hashset_int {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("number of elements:");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = s.nextInt();
        }

        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : arr){
            set.add(num);
        }

        System.out.println(set);

        Integer[] arr1 = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr1));

    }
}
