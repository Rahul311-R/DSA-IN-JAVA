import java.util.Scanner;

public class leetcode_125 {

    static boolean is_palidrome(String a){
        a = a.toLowerCase();
        a = a.replace("[^a-z0-9","");
        int i = 0,j= a.length()-1;
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(is_palidrome(a));

    }
}
