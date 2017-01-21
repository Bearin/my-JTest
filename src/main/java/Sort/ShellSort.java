package Sort;

/**ϣ������
 * �Ľ���ֱ�Ӳ��������㷨
 * @author XB
 */
public class ShellSort {
	
	static void sort(int[] data){
		int h=1,temp;
		
		while(h<data.length/3)
			h=3*h+1;
		while(h>=1){
			//ʹ��ֱ�Ӳ�������
			for(int j=h;j<data.length;j+=h){
				 int i=j-h;
				 temp=data[j];
				 while(i>=0&&temp<data[i]){
					 data[i+h]=data[i];
					 i-=h;
				 }
				 data[i+h]=temp;
			}
			h--;
		}
		
		for(int k:data)
			System.out.print(k+"\t");
	}
	
	public static void main(String[] args){
		int[] data={3,1,8,5,0,2,22,9,6};
		sort(data);
	}
}
