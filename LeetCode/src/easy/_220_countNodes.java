package easy;

import javax.swing.tree.TreeNode;

public class _220_countNodes {

	public int countNodes(TreeNode root) {
		if(root == null) {
			return 0;
		}
		return 1;
//		return countNodes(root.left) + countNodes(root.right) + 1;
		

	}
}
