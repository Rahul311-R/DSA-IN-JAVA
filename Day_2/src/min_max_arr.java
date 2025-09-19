import java.util.Scanner;

class MinMaxArr {
    static int[] min_max(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max}; // return both as array
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int[] result = min_max(arr); // get min & max
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        s.close();
    }
}
