package leetCode.sharui;

public class _226_翻转二叉树 {
	public TreeNode invertTree(TreeNode root) {
		
		if (root == null) {
			return root;
		}
		
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		
		invertTree(root.left);
		invertTree(root.right);
		
        return root;
    }
}
