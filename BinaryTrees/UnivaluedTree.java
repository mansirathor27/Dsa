package BinaryTrees;


class TreeNode{
    int val;
    TreeNode right , left;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class UnivaluedTree {
    public boolean isUnivalTree(TreeNode root){
        return check(root, root.val);
    }
    private boolean check(TreeNode root, int val){
        if(root == null){
            return true;
        }
        if(root.val != val){
            return false;
        }
        boolean left = check(root.left, val);
        boolean right = check(root.right,val);
        return left && right;
    }
}
