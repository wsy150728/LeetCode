package code.q94;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Tag Stack
 * Tag Tree
 * Tag Hash Table
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        inorder(root, res);

        return res;
    }

    public void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }

        // 左结点
        inorder(root.left, res);

        res.add(root.val);

        // 右结点
        inorder(root.right, res);
    }

}
