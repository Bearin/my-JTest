package test;
/**
 * ��ά���鸴������
 * 
 * @author XB
 *
 */
public class test2 {

	public static void main(String[] args) {
		// System.out.println("2+2="+2+2);
		// System.out.printf("%c%c",'h','a');
		int a[][] = { { 2, 2, 2 }, { 3, 3, 3, 7 }, { 2, 2, 2, 2, 1, 1, 2 } };
		//System.out.println(a.length);
		//System.out.println(a[2].length);
		//һά���鸴��
		int b[]={2,1,4};
		int c[]=(int[])b.clone();
		b[1]=10;
		System.out.println("һά���鸴�ƣ��ı�b[1]��ֵ����Ӱ��c[1]");
		System.out.println(c[1]);
		
		//��ά���鸴�Ʒ���
		int d[][]={{1,2,3},{4,5,6},{7,8,9}};
		int e[][] = new int[3][3];
		for(int j=0;j<3;j++)
			//System.arraycopy(e[j],0,d[j] ,0, 3);
			e[j]=(int[])d[j].clone();
		d[0][0]=9;
		System.out.println(e[0][0]);
	//	System.out.println(a[1][4]);
	}
}
