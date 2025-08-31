import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n = s.nextInt();
        s.nextLine();

        TreeSet<String> set = new TreeSet<>();

        for(int i = 0;i<n;i++){
            System.out.print("Enter the element:");
            String a = s.nextLine();
            set.add(a);
        }




        System.out.println(set);

        for(var u : set){
            System.out.print(u+" ");
        }
    }
}
