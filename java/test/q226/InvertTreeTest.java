package test.q226;

import code.q226.TreeNode;
import code.q226.InvertTree;

import java.util.List;

/**
 * @author wangshengyi
 */
public class InvertTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,new TreeNode(2, new TreeNode(1),new TreeNode(3)), new TreeNode(7,new TreeNode(6),new TreeNode(9)));

        InvertTree model = new InvertTree();
        TreeNode res = model.invertTree(root);

        System.out.println(res);
    }
}
