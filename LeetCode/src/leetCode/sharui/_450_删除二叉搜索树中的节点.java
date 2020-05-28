package leetCode.sharui;

public class _450_删除二叉搜索树中的节点 {
	public TreeNode deleteNode(TreeNode root, int key) {
		
		TreeNode node  = find(root, key);
		
		if (haveTwoChild(node)) {
			TreeNode node2 = predecessor(root, node);
			node.val = node2.val;
			node = node2;
		}else if (isLeef(node)) {
			
		}else {
			if (node.left != null) {
				node.val = node.left.val;
				node = node.left;
			}else {
				node.val = node.right.val;
				node = node.right;
			}
		}
		
		node = null;
		return root;
    }
	
	protected TreeNode predecessor(TreeNode root,TreeNode node) {
		if (node == null) return null;
		
		// 前驱节点在左子树当中（left.right.right.right....）
		TreeNode p = node.left;
		if (p != null) {
			while (p.right != null) {
				p = p.right;
			}
			return p;
		}
		return p;
//		// 从父节点、祖父节点中寻找前驱节点
//;		TreeNode parentNode = findParent(root, node.val, null);
//
//		while (parentNode != null && node == parentNode.left) {
//			node = node.parent;
//		}
//
//		// node.parent == null
//		// node == node.parent.right
//		return node.parent;
	}

	
	private TreeNode find(TreeNode root, int key) {
		// TODO Auto-generated method stub
		if (root.val == key) {
			return root;
		}
		find(root.left, key);	
		find(root.right, key);
		return null;
	}
	
	private boolean haveTwoChild(TreeNode node) {
		return node.left != null && node.right != null;
	}
	
	
	private boolean isLeef(TreeNode node) {
		return node.left == null && node.right == null;
	}
	
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
