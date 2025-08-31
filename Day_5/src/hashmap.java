import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        s.nextLine();
        HashMap<String,Integer> map = new HashMap<>();

        for(int i = 0 ;i<n;i++){
            System.out.print("Enter the fruit name:");
            String a = s.nextLine();

            System.out.print("Enter the price of "+a+":");
            int b = s.nextInt();

            map.put(a,b);
        }

        System.out.println(map);

        System.out.println(map.containsKey("apple"));

        map.put("apple",60);
        System.out.println(map);

        map.remove("mango");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}
