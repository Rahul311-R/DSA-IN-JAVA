import java.util.*;
public class leetcode_242 {
    static boolean isAnagram(String s, String t) {
            // If lengths are different, cannot be an anagram
            if (s.length() != t.length()) {
                return false;
            }

            // Convert to char arrays
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare
            return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        System.out.println(isAnagram(a,b));
    }

}
