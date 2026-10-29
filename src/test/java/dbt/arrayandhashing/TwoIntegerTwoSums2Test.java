package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoIntegerTwoSums2Test {

    TwoIntegerTwoSums2 obj = new TwoIntegerTwoSums2();

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void twoSum1() {
        int[] nums = {0, 1, 2, 3, 4};
        int target = 6;
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{2, 4}, result);
    }
}