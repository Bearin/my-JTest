package JOTest;

/**
 * get the single number
 * @author XB
 *
 */
public class SingleNumber {
	
	/**
	 * 时间复杂度太高
	 * @param A
	 * @return
	 */
	static int getSingleNumber1(int[] A){
		int n = A.length;
		boolean hasFound = true;
		int result = 0;
		for(int i =0; i<n; i++){
			
			for(int j = i+1; j<n; j++){
				if(A[i]==A[j]){
					hasFound = true;
					break;
				}
				hasFound = false;
			}
			if(!hasFound){
				result = A[i];
				break;
			}
		}
		return result;
	}
	
	
	/**
	 * 利用很神奇的异或，A^A=0,A^0=A,满足结合律, 具体交换率 参考wiki
	 * 一组数，无论顺序，若成对出现，异或结果为0
	 * A^B^A=B
	 * D=A^B^C --> A=D^B^C
	 * @param A
	 * @return
	 */
	static int getSingleNumber2(int[] A){
		int result = 0;
		int n = A.length;
		for(int i = 0; i<n; i++){
			result = result^A[i]; 
		}
		return result;
	}
	public static void main(String[] args){
		int[] A={1,2,3,4,2,3,1};
		//System.out.println(getSingleNumber(A));
		System.out.println(getSingleNumber2(A));
	}
}
