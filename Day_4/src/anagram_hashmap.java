import java.util.HashMap;
import java.util.Scanner;

public class anagram_hashmap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first string:");
        String str1 = s.nextLine();

        System.out.print("Enter second string:");
        String str2 = s.nextLine();

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");


        HashMap<Character,Integer> fre1 = new HashMap<>();
        for(int i = 0 ; i<str1.length();i++){
            char ch = str1.charAt(i);
            fre1.put(ch, fre1.getOrDefault(ch,0)+1);
        }
        System.out.println("String 1: "+fre1);

        HashMap<Character,Integer> fre2 = new HashMap<>();
        for(int i =0 ;i<str2.length();i++){
            char ch = str2.charAt(i);
            fre2.put(ch,fre2.getOrDefault(ch,0)+1);
        }
        System.out.println("String 2: "+fre2);

        if(fre1.equals(fre2)){
            System.out.println("Its is anagram");
        }else{
            System.out.println("Its is not a anagram");
        }
    }
}
