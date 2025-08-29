import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class hashset_str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("number of elements:");
        int n = s.nextInt();
        s.nextLine();
        String[] arr = new String[n];
        for(int i = 0 ;i<n;i++){
            arr[i] = s.nextLine();
        }

        HashSet<String> set = new HashSet<>();
        for(String a : arr){
            set.add(a);
        }

        System.out.println(set);

        if(set.contains("shiva")){
            System.out.println("It is present in the set ");
        }else{
            System.out.println("It is not found");
        }

    }
}
