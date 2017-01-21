package JOTest;

import java.util.Stack;

/**
 * 
 * @author XB
 * 
 */
public class Evaluate {

	public static int evalRPN(String[] tokens) {
		int n = tokens.length;
		Stack<Integer> stack = new Stack<Integer>();
		int a = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			if(tokens[i].equals("+")){
				a = stack.pop();
				b = stack.pop();
				stack.push((a+b));
			}else if(tokens[i].equals("-")){
				a = stack.pop();
				b = stack.pop();
				stack.push((b-a));
			}else if(tokens[i].equals("*")){
				a = stack.pop();
				b = stack.pop();
				stack.push((a*b));
			}else if(tokens[i].equals("/")){
				a = stack.pop();
				b = stack.pop();
				stack.push((b/a));
			}else{
				stack.push(Integer.parseInt(tokens[i]));
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		String[] input = { "4", "13", "5", "/", "+" };
		System.out.println(evalRPN(input));
	}
}
