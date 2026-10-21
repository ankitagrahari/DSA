package dbt.arrayandhashing;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TwoSums {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])) {
                int j = map.get(target-nums[i]);
                if(i!=j)
                    return i<j ? new int[]{i, j} : new int[]{j, i};
            } else map.putIfAbsent(nums[i], i);
        }
        return new int[]{};
    }
}
