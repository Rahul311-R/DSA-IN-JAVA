import java.util.LinkedHashMap;
import java.util.Scanner;

public class leetcode_387 {
    static int singleindex(String a){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char c : a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int res = -1;
        for(int i = 0;i<a.length();i++){
            char c = a.charAt(i);
            if(map.get(c)==1){
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string:");
        String a = s.nextLine();
        System.out.println(singleindex(a));
    }
}
