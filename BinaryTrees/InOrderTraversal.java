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
public class InOrderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        inOrder(root, ans);
        return ans;
    }
    private void inOrder(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        inOrder(root.left, ans);
        ans.add(root.val);
        inOrder(root.right, ans);
    }
}
