package dbt.arrayandhashing;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int @NotNull [] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num: nums) {
            if(!set.contains(num+1)) {
                int count = 0;
                int k = num;
                while (set.contains(k)) {
                    count++;
                    k--;
                }
                if(count > max) {
                    max = count;
                }
            }
        }
        return max;
    }

    public int longestConsecutive2(int @NotNull [] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for(int num: set){
            if(!set.contains(num-1)) {
                int count = 0;
                while (set.contains(num+count)) {
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
