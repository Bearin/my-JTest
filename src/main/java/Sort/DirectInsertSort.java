package Sort;

/**
 * 直接插入排序算法
 * @author XB
 *
 */
public class DirectInsertSort {
	
	/**
	 * ֱ�Ӳ�������
	 * @param data �����������
	 */
	static void sort(int[] data){
		
		int i,temp;
		//data[j]ֻ����Ǵ��������j֮ǰΪ��������
		for(int j=1;j<data.length;j++){
			i=j-1;
			temp=data[j];
			while(i>=0&&temp<data[i]){ //&&ʱ�������������ν��м���
				
				data[i+1]=data[i];
				i--;
			}
			data[i+1]=temp;
		}
		
		for(int k:data){
			System.out.print(k+"\t");
		}
	}
	
	public static void main(String[] args){
		int data[]={1,0,3,2,52,7,8};
		sort(data);
		
	}
}
