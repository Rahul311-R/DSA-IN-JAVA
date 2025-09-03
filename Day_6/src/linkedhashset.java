import java.util.LinkedHashSet;
import java.util.Scanner;

public class linkedhashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
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

        System.out.println(set.size());

    }
}
