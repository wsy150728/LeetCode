package code.q34;

/**
 * Tag Array
 * Tag Binary Search
 */
public class SearchRange {

    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            // 大于目标值 或者是寻找左边界且等于目标值时向左寻找
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        // 左边界
        int leftIdx = extremeInsertionIndex(nums, target, true);

        // 左边界匹配不上
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }


        targetRange[0] = leftIdx;
        // 右边界
        targetRange[1] = extremeInsertionIndex(nums, target, false) - 1;

        return targetRange;
    }

}
