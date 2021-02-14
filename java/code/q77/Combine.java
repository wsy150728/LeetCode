package code.q77;

import java.util.*;

/**
 * 回溯算法
 *
 * @author admin
 */
public class Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(k <= 0){
            return res;
        }

        Deque<Integer> path = new ArrayDeque<>();
        dfs(1, n, k, path, res);

        return res;
    }

    public void dfs(int i, int n, int k, Deque<Integer> path, List<List<Integer>> res) {
        // 数量相同时取出结果
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 这里 i <= n - (k - path.size()) + 1 做了优化，提高效率
        for (int x = i; x <= n - (k - path.size()) + 1; x++) {
            path.addLast(x);
            dfs(x + 1, n, k, path, res);
            path.removeLast();
        }
    }

}
