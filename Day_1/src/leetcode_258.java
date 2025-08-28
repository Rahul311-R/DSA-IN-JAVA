import java.util.Scanner;

public class leetcode_258 {

    static int addDigit(int n){
        while(n>=10){
            int sum = 0;
            while(n>0){
                sum += n%10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();
        System.out.println(addDigit(n));
    }
}
