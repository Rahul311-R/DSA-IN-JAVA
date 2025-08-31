import java.util.Scanner;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of entity:");
        int n = s.nextInt();
        s.nextLine();
        TreeMap<String, Integer> tree = new TreeMap<>();
        for(int i = 0; i<n ; i++){
            System.out.print("Enter the name:");
            String name = s.nextLine();

            System.out.print("Enter the age:");
            int age = s.nextInt();
            s.nextLine();

            tree.put(name,age);
        }



        for (var a : tree.entrySet()){
            System.out.println(a.getKey()+"->"+a.getValue());
        }

        System.out.println("First: "+tree.firstKey());
        System.out.println("Last: "+tree.lastKey());


    }
}
