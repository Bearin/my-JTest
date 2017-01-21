/**快速排序
 * 
 * @author XB
 *
 */
package Sort;

public class qSort {
	
	public static int divide(int[] a,int low,int high){
		int c=a[low];
		while(low<high){
		
		while(c<=a[high]&&low<high){
			high--;
		}
		if(low<high)
			a[low++]=a[high];
	
		while(low<high&&a[low]<=c){
			low++;
		}
		if(low<high)
			a[high--]=a[low];
		}
		
		a[low]=c;
		return low;
	}
	
	/* 快速排序改进点：1.小数组，快速排序慢于插入排序    2.
	 *  小数组用快速排序的效率低于插入排序 所以在处理小数组时可以换成插入排序处理 
	 */
	public static void sort(int[] a,int low,int high){
		if(low>=high)     //if(....转换条件) {Insertion.sort(a,low,high);return;}
			return;
		int m=divide(a,low,high);
		sort(a,low,m-1);
		sort(a,m+1,high);
	}
	
	public static void main(String[] args){
		int[] a={2,4,1,0,7};
		//时间记录
		long st=System.nanoTime();
		sort(a,0,a.length-1);
		//时间记录
		long et=System.nanoTime();
		for(int i:a){
			System.out.println(i);
		}
		System.out.println(et-st+"ns");//纳秒计算
	}
}
