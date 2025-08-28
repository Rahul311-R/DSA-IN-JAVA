import java.util.HashSet;
import java.util.Scanner;

public class leetcode_3 {

    static int long_substr(String a){
        int maxl=0;
        for(int i = 0;i<a.length();i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = i;j<a.length();j++){
                if(set.contains(a.charAt(j))){
                    break;
                }
                set.add(a.charAt(j));
                maxl = Math.max(maxl,set.size());
            }
        }
        return maxl;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(long_substr(a));
    }
}
