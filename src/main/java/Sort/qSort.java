/**��������
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
	
	/* ��������Ľ��㣺1.С���飬�����������ڲ�������    2.
	 *  С�����ÿ��������Ч�ʵ��ڲ������� �����ڴ���С����ʱ���Ի��ɲ��������� 
	 */
	public static void sort(int[] a,int low,int high){
		if(low>=high)     //if(....ת������) {Insertion.sort(a,low,high);return;}
			return;
		int m=divide(a,low,high);
		sort(a,low,m-1);
		sort(a,m+1,high);
	}
	
	public static void main(String[] args){
		int[] a={2,4,1,0,7};
		//ʱ���¼
		long st=System.nanoTime();
		sort(a,0,a.length-1);
		//ʱ���¼
		long et=System.nanoTime();
		for(int i:a){
			System.out.println(i);
		}
		System.out.println(et-st+"ns");//�������
	}
}
