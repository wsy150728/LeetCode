package code.q75;

/**
 * Tag Sort
 * Tag Array
 * Tag Two Pointers
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        for (int i : nums) {
            switch (i) {
                case 0:
                    redCount++;
                    break;
                case 1:
                    whiteCount++;
                    break;
                default:
                    blueCount++;
                    break;
            }
        }
        for (int i = 0; i < nums.length;i++){
            if(redCount > 0){
                nums[i] = 0;
                redCount--;
            } else if(whiteCount > 0){
                nums[i] = 1;
                whiteCount--;
            } else {
                nums[i] = 2;
                blueCount--;
            }
        }
    }

    /**
     * 0从左往右换，2从右往左放
     * @param nums
     */
    public void sortColors2(int[] nums) {
        // 对于所有 idx < i : nums[idx < i] = 0
        // j是当前考虑元素的下标
        int p0 = 0, curr = 0;
        // 对于所有 idx > k : nums[idx > k] = 2
        int p2 = nums.length - 1;

        int tmp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // 交换第 p0个和第curr个元素
                // i++，j++
                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            }
            else if (nums[curr] == 2) {
                // 交换第k个和第curr个元素
                // p2--
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;
            }
            else curr++;
        }
    }

}
