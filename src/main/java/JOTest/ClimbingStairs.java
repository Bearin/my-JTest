package JOTest;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
 * you climb to the top?
 * 
 * 思路： f(n) = f(n-1) + f(n-2）
 * 
 * @author XB
 *
 */
public class ClimbingStairs {
	public static int climbStairs(int n) {
		int pre = 1;
		int result = 2;
		if (n == 1 || n == 0) {
			return 1;
		}
		for (int i = 2; i < n; i++) {
			result += pre;
			pre = result - pre;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(2));
	}
}
