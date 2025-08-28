import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to get reversed:");
        int n = s.nextInt();
        int sum = 0;
        while(n > 0){
            sum = (sum*10) + (n%10);
            n /= 10;
        }
        System.out.println("reverse"+sum);
    }
}
