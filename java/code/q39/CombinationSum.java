package code.q39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangshengyi
 */
public class CombinationSum {
    // DFS
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();

        if (candidates.length == 0) {
            return res;
        }

        LinkedList<Integer> each = new LinkedList<>();

        dfs(candidates, target, each, res, 0);
        return res;
    }

    public void dfs(int[] candidates, int target, LinkedList<Integer> each, List<List<Integer>> res, int begin) {
        if (target == 0) {
            res.add(new ArrayList<>(each));
            return;
        }

        for (int i = begin; i < candidates.length; i++) {
            if(target - candidates[i] < 0){
                break;
            }

            each.addLast(candidates[i]);

            dfs(candidates, target - candidates[i], each, res, i);

            each.removeLast();
        }
    }
}
