import java.util.Scanner;

public class leetcode_344 {

    static void rev(char[] arr){
        int i =0,j=arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] arr = a.toCharArray();
        rev(arr);
        for(char t : arr){
            System.out.print(t);
        }
    }
}
