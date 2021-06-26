package code.q33;

/**
 * Tag Array
 * Tag Binary Search
 */
public class Search {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if(right == 0){
            return nums[0] == target ? 0 : -1;
        }

        while (left <= right) {
            int mid = left + right >>> 1;
            if (nums[mid] == target) {
                return mid;
            }

            // 判断左右两边有序性
            if(nums[0] <= nums[mid]){// 左边有序
                if(target >= nums[left] && target <= nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            } else{ // 右边有序
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

}
