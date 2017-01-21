package JOTest;
/**
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 * 
 * 递归： 以某个节点为root，则可成的搜索树数目为左子树*右子树
 * 
 * 这样的话， 也可以用动态规划
 * 
 * @author XB
 *
 */
public class UniqueBinarySearchTrees {
	public static int numTrees(int n) {
		return getNum(1, n);
	}
	
	public static int getNum(int start, int end){
		if(start >= end)
			return 1;
		int result = 0;
		for(int i=start; i<=end; i++)
			result += getNum(start, i-1) * getNum(i+1, end); 
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(numTrees(3));
	}
}
