package JOTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 思路：
 *    用栈
 * @author XB
 *
 */
public class RomanToInteger {
	static Map<Character, Integer> map = new HashMap<Character, Integer>(){{
		put('I', 1); 
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};
	public static int romanToInt(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int temp = 0, cur = 0;
		for(int i=0;i<s.length();i++){
			cur = map.get(s.charAt(i));
//			cur = getInteger(s.charAt(i));
			if(cur <= temp)
				stack.push(cur);
			else{
				stack.pop();
				stack.push(cur-temp);
			}
			temp = cur;
		}
		int result = 0;
		while(stack.size() != 0)
			result = result + stack.pop();
		return result;
	}

	public static int getInteger(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}

	/**
	 * 网友的解法， 更简单, 超省时间
	 * @param s
	 * @return
	 */
	public static int romanToInt_2(String s) {
	    int res = 0;
	    for (int i = s.length() - 1; i >= 0; i--) {
	        char c = s.charAt(i);
	        switch (c) {
	        case 'I':
	            res += (res >= 5 ? -1 : 1);
	            break;
	        case 'V':
	            res += 5;
	            break;
	        case 'X':
	            res += 10 * (res >= 50 ? -1 : 1);
	            break;
	        case 'L':
	            res += 50;
	            break;
	        case 'C':
	            res += 100 * (res >= 500 ? -1 : 1);
	            break;
	        case 'D':
	            res += 500;
	            break;
	        case 'M':
	            res += 1000;
	            break;
	        }
	    }
	    return res;
	}
	
	/**
	 * 网友作品 
	 * @param s
	 * @return
	 */
	public static int romanToInt_3(String s) {
	     int sum=0;
	    if(s.indexOf("IV")!=-1){sum-=2;}
	    if(s.indexOf("IX")!=-1){sum-=2;}
	    if(s.indexOf("XL")!=-1){sum-=20;}
	    if(s.indexOf("XC")!=-1){sum-=20;}
	    if(s.indexOf("CD")!=-1){sum-=200;}
	    if(s.indexOf("CM")!=-1){sum-=200;}

	    char c[]=s.toCharArray();
	    int count=0;

	   for(;count<=s.length()-1;count++){
	       if(c[count]=='M') sum+=1000;
	       if(c[count]=='D') sum+=500;
	       if(c[count]=='C') sum+=100;
	       if(c[count]=='L') sum+=50;
	       if(c[count]=='X') sum+=10;
	       if(c[count]=='V') sum+=5;
	       if(c[count]=='I') sum+=1;

	   }
	   return sum;
	}
	
	public static void main(String[] args){
		long startTime, endTime;
		long result = 0;
		for(int i=0;i<100;i++){
			startTime=System.nanoTime();
			romanToInt_2("CMD");
			endTime = System.nanoTime();
			result += (endTime- startTime);
		}
		System.out.println(result/100.0);
	}
}
