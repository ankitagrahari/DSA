package dbt.arrayandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductArrayItself {

//    0,0,4,2,3 -> 0, 0, 0, 0, 0
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        List<Integer> zeroIndexes = new ArrayList<>();
        boolean isHavingZero = false;
        for (int i=0; i<nums.length; i++) {
            if(nums[i]!=0) product *= nums[i];
            else {
                zeroIndexes.add(i);
                isHavingZero = true;
            }
        }

        int[] output = new int[nums.length];

        if(isHavingZero){
            if(zeroIndexes.size()==nums.length) return nums;
            if(zeroIndexes.size()>1) {
                Arrays.fill(output,0);
                return output;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(isHavingZero){
                output[i] = zeroIndexes.contains(i) ? product: 0;
            } else {
                output[i] = product/nums[i];
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
