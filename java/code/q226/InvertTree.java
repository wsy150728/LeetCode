package code.q226;



/**
 * @author admin
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }


        invertTree(root.left);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.right);

        return root;
    }


}
