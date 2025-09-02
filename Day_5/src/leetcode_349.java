
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class leetcode_349 {

        public int[] intersection(int[] nums1, int[] nums2) {
            HashMap<Integer, Boolean> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            // put all nums1 elements into map
            for(int num : nums1) {
                map.put(num, true);
            }

            // check nums2 against map
            for(int num : nums2) {
                if(map.containsKey(num)) {
                    result.add(num);
                    map.remove(num); // ensures uniqueness
                }
            }

            // convert List<Integer> to int[]
            int[] res = new int[result.size()];
            for(int i = 0; i < result.size(); i++) {
                res[i] = result.get(i);
            }

            return res;
        }


}
