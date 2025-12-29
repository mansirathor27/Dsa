package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
public class PostOrderTraversal {
    public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        postOrder(root, ans);
        return ans;
    }
    private void postOrder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        postOrder(root.left, ans);
        postOrder(root.right, ans);
        ans.add(root.val);
    }
}
