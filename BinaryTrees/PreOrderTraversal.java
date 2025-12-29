package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;s
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}


public class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        preOrder(root, ans);
        return ans;
    }
    private void preOrder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        preOrder(root.left, ans);
        preOrder(root.right, ans);
    }
}
