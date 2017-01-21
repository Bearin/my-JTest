package test;

import org.apache.commons.lang3.StringUtils;

/**
 * StringUtils.countMatches(A,B);
 * 返回A中B出现的次数
 * @author XB
 */
public class test12 {
	public static void main(String[] args) {
		// System.out.println(~0);
		// System.out.println(2^3);
		// System.out.println(~(2^3));
		int[] A = {2,3,1,2,2,3,3};
		System.out.println(StringUtils.countMatches("asdfasdf", "as"));
	}
}
