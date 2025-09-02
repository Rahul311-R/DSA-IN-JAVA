import java.util.HashMap;
import java.util.Scanner;

public class leetcode_136 {

    static int singlenum(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int k : map.keySet()){
            if(map.get(k)==1){
                return k;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println(singlenum(arr));
    }
}
