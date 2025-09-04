import java.util.Scanner;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<n;i++){
            set.add(s.nextInt());
        }
        System.out.println(set);

        set.remove(20);
        System.out.println(set);

        if(set.contains(30)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if (!set.isEmpty()) {
            System.out.println("First (smallest): " + set.first());
            System.out.println("Last (largest): " + set.last());
        }

        System.out.println("Ceiling(25): " + set.ceiling(25)); // ≥ 25
        System.out.println("Floor(25): " + set.floor(25));     // ≤ 25


        System.out.println(set.size());

    }
}
