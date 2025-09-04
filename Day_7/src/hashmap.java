import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of entity:");
        int n = s.nextInt();

        HashMap<Integer,String> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            System.out.print("Enter the key");
            int a = s.nextInt();
            System.out.print("Enter the value:");
            String b = s.next();
            map.put(a,b);
        }

        System.out.println(map);

        System.out.println("value of 1:"+ map.get(1));

        System.out.println(map.containsKey(3));

        map.remove(3);
        System.out.println(map);

        for(int key : map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
}
