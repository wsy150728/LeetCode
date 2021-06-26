package code.q31;

/**
 * @author wangshengyi
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // 1、从后向前查找第一个相邻升序的元素对 (i,j)，满足 A[i] < A[j]。此时 [j,end) 必然是降序
        // 2、在 [j,end) 从后向前查找第一个满足 A[i] < A[k] 的 k。A[i]、A[k] 分别就是上文所说的「小数」、「大数」
        // 3、将 A[i] 与 A[k] 交换
        // 4、可以断定这时 [j,end) 必然是降序，逆置 [j,end)，使其升序
        // 5、如果在步骤 1 找不到符合的相邻元素对，说明当前 [begin,end) 为一个降序顺序，则直接跳到步骤 4
// i = 4 j = 5 end = 7
        // 一个数直接返回
        if (nums.length < 2) {
            return;
        }
        int i;
        int k;
        int j = -1;
        // 找到ij
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                j = i + 1;
                break;
            }
        }

        // 如果在步骤 1 找不到符合的相邻元素对，说明当前 [begin,end) 为一个降序顺序，则直接反转
        if (j == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (k = nums.length - 1; k >= j; k--) {
            if (nums[k] > nums[i]) {
                swap(nums, i, k);
                break;
            }
        }
        reverse(nums, j, nums.length - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            swap(nums, start++, end--);
        }
    }
}
