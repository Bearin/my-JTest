package JOTest;

import java.util.ArrayList;

public class SingleNumberII {
	/**
	 * 网友办法
	 * 
	 * 数字的都是用bit的,依次检查数组中每个数的第i位，那么所有数的第i位的和对3取余的结果应为0或1，
	 * 当为1，这说明single number在第i位的是1， 那么只要记录下single number在哪些位上是1就可以了.
	 * 
	 * @param A
	 * @return
	 */
	static int singleNumber_2(int A[]) {
	    int[] count = new int[32];
	    int n = A.length;
	    int result = 0;
	    for (int i = 0; i < 32; i++) {
	        for (int j = 0; j < n; j++) {
	            if (((A[j] >> i) & 1)>0) {
	                count[i]++;
	            }
	        }
	        result |= ((count[i] % 3) << i);
	    }
	    return result;
	}
	
	/**
	 * 时间复杂度太高
	 * @param A
	 * @return
	 */
	public static int singleNumber(int[] A) {
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		for(int k:A){
			if(isIn(k, two)){
				delete(k, one);
				delete(k , two);
			}else{
				if (isIn(k, one)) {
					two.add(k);
				} else {
					one.add(k);
				}
			}
		}
		return one.get(0);
	}
	
	public static void delete(int i, ArrayList<Integer> a){
		for(int j=0;j<a.size();j++){
			if(a.get(j) == i){
				a.remove(j);
			}
		}
	}
	
	public static boolean isIn(int i, ArrayList<Integer> a){
		for(Integer j:a){
			if(j == i)
				return true;
		}
		return false;
	}
	
	
	public static void main(String[] args){
		int[] A = {2,3,1,2,2,3,3};
		long start = System.nanoTime();
		System.out.println(singleNumber_2(A));
		long end = System.nanoTime();
		System.out.println(end-start);
	}
}
