import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        // Create a Hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // loop over all the values and check if map contains the
        // target - current value
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }

            // else put the current value into the map as key with index as value
            map.put(nums[i], i);
        }

        return new int[]{0,0};
    }
}
