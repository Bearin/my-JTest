package JOTest;

/**
 * Given an input string, reverse the string word by word. 
 * What constitutes a word? A sequence of non-space characters constitutes a word.
 *  Could the input string contain leading or trailing spaces? Yes. However, your reversed string
 * should not contain leading or trailing spaces.
 * How about multiple spaces between two words? Reduce them to a single space in the reversed string.
 * 
 * @author XB
 * 
 */
public class ReverseWordsInString {

	public static String reverseWords(String s) {
		String[] f = s.split(" ");
		int n = f.length - 1;
		StringBuffer result = new StringBuffer();
		for (int i = n; i >= 0; i--) {
			if (i == 0 || (i >= 1 && f[i - 1].isEmpty() == true))
				result.append(f[i]);
			else {
				result.append(f[i]).append(" ");
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// System.out.println(reverseWords("the sky is blue"));
		System.out.println(reverseWords(" 1"));

	}
}
