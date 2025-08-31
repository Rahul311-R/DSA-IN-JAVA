import java.util.LinkedHashSet;
import java.util.Scanner;

public class linkedhashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n = s.nextInt();
        s.nextLine();

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for(int i = 0;i<n;i++){
            System.out.print("Enter the element:");
            String a = s.nextLine();
            set.add(a);
        }



        for(var u : set){
            System.out.print(u+" ");
        }

        System.out.println(set);
    }
}
