package dbt.arrayandhashing;

public class TwoIntegerTwoSums2 {

    public int[] twoSum(int[] numbers, int target) {
        int fp = 0, sp = numbers.length-1;
        while (fp < sp && sp < numbers.length) {
            int sum = numbers[fp] + numbers[sp];
            if (sum == target) return new int[]{fp, sp};
            if (sum > target) sp--;
            if (sum < target) fp++;
        }
        return new int[]{};
    }
}

