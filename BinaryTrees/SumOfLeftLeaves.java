package BinaryTrees;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum += root.left.val;
            }else{
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum+= sumOfLeftLeaves(root.right);
        return sum;
    }
}
