package code.q209;


import java.util.Arrays;

/**
 * @author admin
 */
public class MinSubArrayLen {

    /**
     * 暴力法
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        if(Arrays.stream(nums).sum() < target){
            return 0;
        }
        int minLength = Integer.MAX_VALUE;
        int tempSum;
        for (int i = 0; i < nums.length; i++) {
            tempSum = nums[i];
            if(tempSum >= target){
                return 1;
            }
            // int[] nums = {2,3,1,2,4,3};
            for (int j = i + 1;j < nums.length;j++){
                tempSum += nums[j];
                if(tempSum >= target){
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }

        return minLength;
    }


    /**
     * 双指针方式
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen2(int target, int[] nums) {
        int lo = 0, hi = 0, sum = 0, min = Integer.MAX_VALUE;
        while (hi < nums.length) {
            sum += nums[hi++];
            while (sum >= target) {
                min = Math.min(min, hi - lo);
                sum -= nums[lo++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    /**
     * 双指针方式
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen3(int target, int[] nums) {
        int lo = 0, hi = 0, min = Integer.MAX_VALUE;
        while (hi < nums.length) {
            target -= nums[hi++];
            while (target <= 0) {
                min = Math.min(min, hi - lo);
                target += nums[lo++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }


}
