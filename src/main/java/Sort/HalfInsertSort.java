package Sort;

/**
 * 折半插入排序
 * @author XB
 */
public class HalfInsertSort {
	
	static void sort(int[] data){
		int low,high,mid,temp;
		
		for(int i=1;i<data.length;i++){
			temp=data[i];
			low=0;
			high=i-1;
			while(low<=high){
				mid=(high+low)/2;
				if(temp<data[mid])
					high=mid-1;
				else
					low=mid+1;
			}
			//�ҵ�Ҫ�����λ��low�󣬽�low��i-1֮���Ԫ��ȫ������
			for(int j=i;j>low;j--)
				data[j]=data[j-1];
			//�Ѵ����Ԫ�ز��뵽�ʵ�λ��
			data[low]=temp;
		}
		
		
		for(int k:data)
			System.out.print(k+"\t");
	}
	
	public static void main(String[] args){
		int data[]={2,1,6,3,77,8};
		sort(data);
	}
}
