package JOTest;

/**
 * 
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray
 * [4,−1,2,1] has the largest sum = 6.
 * 
 * 思路1：(未解)
 * 		sum[i, j] = sum[0, j] - sum[0, i-1] = sum[i, end] - sum[j+1, end];
 * 		sum[i, j] = 1/2{ (sum[0, j] - sum[j+1, end]) - (sum[0, i-1] - sum[i, end]) }
 * 		求max(sum[0, j] - sum[j+1, end]), min(sum[0, i-1] - sum[i, end])
 * 
 * @author XB
 *
 */
public class MaximumSubarray {
	public static int maxSubArray(int[] A) {
		int n = A.length;
		if(n == 1)
			return A[0];
		int sum = 0;
		int min, max;
		int a, b;
		
		for (int i : A) {
			sum += i;
		}
		b = sum;
		max = 2*A[0] - sum;
		min = max;
		for (int i = 0; i < n; i++) {
			b = b - A[i];
			a = sum - b;
			if (a - b > max) {
				max = a - b;
			}
			if (a - b < min) {
				min = a - b;
			}
		}
		return (max - min) / 2;
	}

	public static void main(String[] args) {
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		System.out.println(maxSubArray(new int[]{-2, -1}));
//		System.out.println(Integer.MIN_VALUE);
	}
}
