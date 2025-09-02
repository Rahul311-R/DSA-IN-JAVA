
import java.util.*;

public class leetcode_349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
            HashMap<Integer, Boolean> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            for(int num : nums1) {
                map.put(num, true);
            }

            for(int num : nums2) {
                if(map.containsKey(num)) {
                    result.add(num);
                    map.remove(num);
                }
            }

            int[] res = new int[result.size()];
            for(int i = 0; i < result.size(); i++) {
                res[i] = result.get(i);
            }

            return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }

        int m = s.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
}
