import java.util.HashMap;
import java.util.Scanner;

public class leetcode_219 {

    static boolean Dupl(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (map.containsKey(num)) {
                int prevIndex = map.get(num);
                if (i - prevIndex <= k) {
                    return true;
                }
            }

            map.put(num, i);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = s.nextInt();
        }
        int k = s.nextInt();

        System.out.println(Dupl(nums,k));
    }
}
