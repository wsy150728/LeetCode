package code.q1305;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Tag Sort
 * Tag Tree
 */
public class GetAllElements {
    private List<Integer> list;

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        dfs(root1);
        dfs(root2);
        Collections.sort(list);
        return list;
    }

    private void dfs(TreeNode root1) {
        if (root1 == null) {
            return;
        }

        list.add(root1.val);
        dfs(root1.left);
        dfs(root1.right);
    }
}
