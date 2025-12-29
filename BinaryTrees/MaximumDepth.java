package BinaryTrees;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class MaximumDepth {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftTree = maxDepth(root.left);
        int rightTree = maxDepth(root.right);
        return 1+ Math.max(leftTree, rightTree);
    }
}
