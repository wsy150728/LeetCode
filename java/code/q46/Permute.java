package code.q46;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author wangshengyi
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> each = new ArrayDeque<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, each, res, 0);

        return res;
    }

    public void dfs(int[] nums, boolean[] used, Deque<Integer> each, List<List<Integer>> res, int x) {
        if (x == nums.length) {
            res.add(new ArrayList<>(each));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                each.addLast(nums[i]);
                used[i] = true;
                dfs(nums, used, each, res, x + 1);
                used[i] = false;
                each.removeLast();
            }
        }
    }
}
