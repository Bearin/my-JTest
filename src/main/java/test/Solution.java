package test;
import java.util.HashSet;

/**
 * hash 作为比较的依据是hashCode返回相等的情况下 equals 返回true
 * 
 * @author XB
 *
 */
public class Solution {
	private String val = null;

	public Solution(String v) {
		val = v;
	}

//	public boolean equals(Object s) {
//		if (s == this) {
//			return true;
//		}
//		if (s instanceof Solution) {
//			Solution tmp = (Solution) s;
//			return this.val.equals(tmp.val);
//		}
//		return false;
//	}
//
//	public int hashCode() {
//		// return (int)System.nanoTime();
//		return 1;
//	}

	public static void main(String[] args) {

		HashSet<Solution> set = new HashSet<Solution>();
		Solution s1 = new Solution("ob");
		System.out.println(s1.hashCode());
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		Solution s2 = new Solution("ob");
		System.out.println(s2.hashCode());
		set.add(s1);
		System.out.println(set.contains(s2));
		System.out.println(s1.equals(s2));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((val == null) ? 0 : val.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solution other = (Solution) obj;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		return true;
	}
}
