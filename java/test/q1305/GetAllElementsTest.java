package test.q1305;

import code.q1305.GetAllElements;
import code.q1305.TreeNode;

import java.util.List;

public class GetAllElementsTest {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        GetAllElements model = new GetAllElements();
        List<Integer> nums = model.getAllElements(root1, root2);

        System.out.println(nums.toString());
    }
}
