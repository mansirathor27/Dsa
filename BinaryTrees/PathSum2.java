package BinaryTrees;
import java.util.*;
public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, ans);
        return ans;
    }
    private void dfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans){
        if(root == null){
            return;
        }
        path.add(root.val);
        targetSum -= root.val;

        if(root.left == null && root.right == null && targetSum == 0){
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left, targetSum, path, ans);
        dfs(root.right, targetSum, path, ans);

        path.remove(path.size() -1);
    }
}
