import java.util.HashMap;
import java.util.Scanner;

public class leetcode_383 {
     boolean ca(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String a = s.nextLine();
        System.out.print("Enter a string:");
        String b = s.nextLine();
        leetcode_383 c = new leetcode_383();
        boolean t = c.ca(a,b);
        System.out.println(t);
    }
}
