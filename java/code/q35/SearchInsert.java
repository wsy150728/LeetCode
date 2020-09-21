package code.q35;

/**
 * Tag Array
 * Binary Search
 */
public class SearchInsert {

    /**
     * 暴力法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }

        return ans;
    }

}
