package test.tree;

import code.tree.PreOrderTraversal;
import code.tree.TreeNode;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangshengyi
 */
public class PreOrderTraversalTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));

        PreOrderTraversal model = new PreOrderTraversal();
        List<Integer> output = model.preOrderTraversal(root);

        System.out.println(output);
    }
}
