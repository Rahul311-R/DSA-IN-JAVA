import java.util.HashMap;
import java.util.Scanner;

public class leetcode_217 {

    static boolean isduplicate(int[] arr){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,true);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(isduplicate(arr));
    }
}
