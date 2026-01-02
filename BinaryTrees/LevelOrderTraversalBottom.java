package BinaryTrees;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
class LevelOrderTraversalBottom{
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            ans.add(level);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i = ans.size() -1 ;i>=0; i--){
            res.add(ans.get(i));
        }
        return res;
    }
}