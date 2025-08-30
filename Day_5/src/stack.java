import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        Stack<Integer> box = new Stack<>();

        for(int i = 0 ;i<n;i++){
            System.out.print("Enter the element:");
            int a = s.nextInt();
            box.push(a);
        }

        System.out.println(box);

        System.out.println("top.element="+box.peek());

        box.pop();
        System.out.println(box);

        System.out.println(box.isEmpty());

    }
}
