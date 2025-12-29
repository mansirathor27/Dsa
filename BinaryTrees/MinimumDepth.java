package BinaryTrees;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class MinimumDepth {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null){
            return 1 + minDepth(root.right);
        }
        if(root.right == null){
            return 1+ minDepth(root.left);
        }

        int leftTree = minDepth(root.left);
        int rightTree = minDepth(root.right);
        return 1+ Math.min(leftTree, rightTree);
    }
}
