import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        HashMap<String,Integer> map = new HashMap<>();

        System.out.print("Enter the number of entity:");
        int n = s.nextInt();
        s.nextLine();

        for(int i = 0 ; i<n ;i++){
            System.out.print("Enter the name:");
            String name = s.nextLine();

            System.out.print("Enter the age:");
            int age = s.nextInt();
            s.nextLine();

            map.put(name,age);
        }

        System.out.println(map);


        System.out.print("Enter the name to search:");
        String nam = s.nextLine();
        if(map.containsKey(nam)){
            System.out.println(nam+" "+map.get(nam));
        }else {
            System.out.println("Not found");
        }


        System.out.print("Enter the age to search:");
        int age = s.nextInt();
        if(map.containsValue(age)){
            System.out.println("yes,found");
        }else{
            System.out.println("Not found");
        }

        s.nextLine(); // consume leftover newline
        System.out.print("\nDo you want to delete an entry? (y/n): ");
        char d = s.next().charAt(0);
        if(d == 'y'){
            s.nextLine(); // consume newline
            System.out.print("Enter name to delete: ");
            String del = s.nextLine();
            if(map.containsKey(del)){
                map.remove(del);
                System.out.println(del + " removed successfully!");
            } else {
                System.out.println("Name not found!");
            }
        }


        System.out.print("can I prine full hashmap(y/n):");
        char t = s.next().charAt(0);
        if(t=='y'){
        System.out.println("all entity");
        for(String o : map.keySet() ){
            System.out.println(o +"->"+map.get(o));
        }}
        else{
            return;
        }
    }
}
