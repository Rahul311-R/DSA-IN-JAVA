import java.util.HashMap;
import java.util.Scanner;

public class freqcount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("enter the elements:");
        for(int i = 0 ; i<n ; i++ ){
            arr[i] = s.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for( int a : arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        System.out.println(map);
    }
}
