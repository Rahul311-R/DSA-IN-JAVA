import java.util.HashSet;
import java.util.Scanner;

public class hashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n;i++){
            set.add(s.nextInt());
        }
        System.out.print(set);



        set.remove(20);
        System.out.print(set);


        if(set.contains(30)){
            System.out.println("true");
        }

        System.out.println(set.size());
    }
}
