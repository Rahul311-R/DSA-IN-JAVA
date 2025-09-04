import java.util.HashMap;
import java.util.Scanner;

public class leetcode_242 {
    static boolean anagram(String a , String b){
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : b.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.get(c)-1);
            if(map.get(c)==0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String a = s.nextLine();
        System.out.print("Enter a string:");
        String b = s.nextLine();
        System.out.println(anagram(a,b));
    }
}
