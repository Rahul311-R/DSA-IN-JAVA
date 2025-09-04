import java.util.HashSet;
import java.util.Scanner;

public class leetcode_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                res.add(nums2[i]);
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for (int n : res) {
            arr[i++] = n;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number of elements in array:");
        int n = s.nextInt();
        System.out.print("enter the elements:");
        int[] nums1 = new int[n];
        for(int j = 0;j<n;j++){
            nums1[j]=s.nextInt();
        }
        System.out.print("enter the number of elements in array:");
        int m = s.nextInt();
        System.out.print("enter the elements:");
        int[] nums2 = new int[m];
        for(int j = 0;j<m;j++){
            nums2[j]=s.nextInt();
        }
        for (int t : intersection(nums1,nums2)){
            System.out.println(t+" ");
        }
    }

}

