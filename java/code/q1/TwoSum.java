package code.q1;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] x = new int[2];
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    x[0] = i;
                    x[1] = j;
                }
            }
        }
        return x;
    }
}