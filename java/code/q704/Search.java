package code.q704;

public class Search {
    public int search(int[] nums, int target) {
//        int[] s = {-1,0,3,5,9,12};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + right >>> 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
