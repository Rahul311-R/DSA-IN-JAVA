import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class leetcode_242 {

    static boolean anagram(String a , String b){
        char[] arr = a.toCharArray();
        char[] arr1 = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        System.out.println(anagram(a,b));
    }
}
