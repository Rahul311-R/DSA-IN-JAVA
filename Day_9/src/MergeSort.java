import java.util.Scanner;

public class MergeSort {

    // Function to merge two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {
        int i = left;      // start index of left half
        int j = mid + 1;   // start index of right half
        int k = 0;         // index for temp array

        int[] temp = new int[right - left + 1]; // temp array

        // Compare elements and store in temp
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy temp back into arr
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    // Merge Sort function
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);      // sort left half
            mergeSort(arr, mid + 1, right); // sort right half
            merge(arr, left, mid, right);   // merge both halves
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
