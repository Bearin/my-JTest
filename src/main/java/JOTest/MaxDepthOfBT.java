package JOTest;

/**
 * 求二叉树的最大深度
 * @author XB
 *
 */
public class MaxDepthOfBT {
	
	//递归
	static int maxDepth(TreeNode root) {
		int depthL = 0;
		int depthR = 0;
		if(root == null)
			return 0;
		if(root.left!=null)
			depthL = maxDepth(root.left)+1;
		if(root.right!=null)
			depthR = maxDepth(root.right)+1;
		if(root.left==null&&root.right==null)
			return 1;
		return depthL>=depthR?depthL:depthR;
	}
	
	public static void main(String[] args){
		TreeNode t = new TreeNode(1);
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(1);
		t1.left = t2;
		t.left = t1;
		System.out.println(maxDepth(t));
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}