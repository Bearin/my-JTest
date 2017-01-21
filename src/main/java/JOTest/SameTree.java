package JOTest;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * 递归！SO EASY
 * @author XB
 * 
 */
public class SameTree {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null)
			return true;
		else if(p==null||q==null)
			return false;
		if(isSameTree(p.left, q.left)&&isSameTree(p.right, q.right)
				&&p.val==q.val)
			return true;
		return false;
	}
}
