package BinaryTrees;
class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class MergeTwoBinaryTrees {
    public TreeNode mergeBinaryTrees(TreeNode root1, TreeNode root2){
        if(root1 == null) {
            return root2;
        }
        if(root2 == null){
            return root1;
        }
        
        root1.val += root2.val;

        root1.left = mergeBinaryTrees(root1.left, root2.left);
        root1.right = mergeBinaryTrees(root1.right, root2.right);
        return root1;
    }
}
