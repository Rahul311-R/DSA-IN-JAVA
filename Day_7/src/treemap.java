import java.util.LinkedHashMap;
import java.util.Scanner;

public class treemap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of entity:");
        int n = s.nextInt();

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the key");
            int a = s.nextInt();
            s.nextLine();
            System.out.print("Enter the value:");
            String b = s.nextLine();
            map.put(a, b);
        }

        System.out.println(map);

        System.out.println("value of 1:" + map.get(1));

        System.out.println(map.containsKey(3));

        map.remove(3);
        System.out.println(map);

        for (int key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }
    }
}
