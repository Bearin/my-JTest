package test;
/**
 * try,final,return����
 * 
 * @author XB
 *
 */
public class test4 {
	public static int test(){
		int i=0;
		try{
			return i;
		}finally{
			i++;
		}
	}
	
	public static void main(String[] args){
		System.out.println(test());
	}
}
