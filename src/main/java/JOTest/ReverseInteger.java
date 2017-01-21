package JOTest;

/**
 * Reverse digits of an integer.
 * 
 * @author XB
 * 
 */
public class ReverseInteger {
	public static int reverse(int x) {
		if(x==0)
			return 0;
		
		String str = Integer.toString(Math.abs(x));
		if(x>0)
			return reverseString(str);
		else
			return -reverseString(str);
	}
	
	static int  reverseString(String str){
		String[] s = str.split("");
		int n =s.length;
		StringBuffer result = new StringBuffer();
		for(int i = n-1;i>=0 ; i--){
			if(!s[i].equals(" "))
				result.append(s[i]);
		}
		return Integer.parseInt(result.toString());
	}
	
	public static void main(String[] args){
		System.out.println(reverse(215));
	}
}
