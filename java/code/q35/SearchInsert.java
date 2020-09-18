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
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid = nums.length / 2;

        while (){
            /**
             * 比目标数小，则找右边
             * 比目标数大，则找左边
             */
            if(nums[mid] < target){
                left = mid;
            }else {
                right = mid;
            }
        }
    }

}
