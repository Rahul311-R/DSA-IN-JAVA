import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class leetcode_1 {

    static int[] addTwo(int[] arr , int tar){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<arr.length;i++) {
            int rem = tar - arr[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int tar = s.nextInt();
        System.out.println(Arrays.toString(addTwo(arr,tar)));
    }
}
