package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left, right;
    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
public class LevelOrderTraversal {
    public List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i< size; i++){
                TreeNode node = q.poll();
                level.add(node.data);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
