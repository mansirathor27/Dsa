package BinaryTrees;

public class BinaryTreeFromInorderPreOrder {
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        return build(preorder, inorder, 0, inorder.length - 1);
    }
    private TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd){
        if(inStart > inEnd){
            return null;
        }
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int inIndex = inStart;
        while(inorder[inIndex] != rootVal){
            inIndex++;
        }
        root.left = build(preorder, inorder, inStart, inIndex -1);
        root.right = build(preorder, inorder, inIndex + 1, inEnd);
        return root;
    }
}
