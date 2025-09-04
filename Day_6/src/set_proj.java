import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class set_proj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();

        HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> linkedset = new LinkedHashSet<>();
        TreeSet<Integer> treeset = new TreeSet<>();

        System.out.print("enter the elements:");
        for(int i = 0;i<n;i++){
            int a = s.nextInt();
            set.add(a);
            linkedset.add(a);
            treeset.add(a);
        }

        System.out.println("HashSet:"+set);
        System.out.println("LinkedHashSet:"+linkedset);
        System.out.println("TreeSet:"+treeset);
    }
}
