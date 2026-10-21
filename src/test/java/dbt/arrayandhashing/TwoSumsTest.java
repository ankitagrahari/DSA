package dbt.arrayandhashing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    TwoSums obj;
    @BeforeEach
    void setUp() {
        obj = new TwoSums();
    }

    @Test
    void twoSum() {
        int[] input = new int[]{3,4,5,6};
        int target = 7;
        int[] result = obj.twoSum(input, target);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{0,1}, result);
    }
}